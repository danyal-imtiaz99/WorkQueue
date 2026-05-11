# Test Plan

> The minimum tests for first success. Add more only if a real bug demands it.
> One test, one behavior. Name by behavior, not method.

---

## Service tests — `TaskServiceTest`

| Test | What it proves | Status |
|---|---|---|
| `createTask_setsStatusToTODO` | New tasks always start at TODO | [ ] |
| `markComplete_changesStatusToDONE` | markComplete actually changes status | [ ] |
| `getTaskById_throwsWhenMissing` | Missing id throws TaskNotFoundException | [ ] |

## Controller tests — `TaskControllerTest` (`@WebMvcTest`)

| Test | What it proves | Status |
|---|---|---|
| `postTask_returns201` | Valid POST returns 201 with body | [ ] |
| `postTask_emptyTitle_returns400` | Empty title triggers validation → 400 | [ ] |

## Integration tests — `TaskCoreIntegrationTest` (`@SpringBootTest`)

| Test | What it proves | Status |
|---|---|---|
| `createAndRetrieveTask_endToEnd` | Full HTTP → service → JPA → H2 → HTTP works | [ ] |

---

## Notes (one line per test about *why* you wrote it)

- `createTask_setsStatusToTODO` — guards business rule that tasks start as TODO
- `markComplete_changesStatusToDONE` — proves the only state transition we expose
- `getTaskById_throwsWhenMissing` — wires up the 404 path end-to-end with the controller advice
- `postTask_returns201` — confirms HTTP shape and status code
- `postTask_emptyTitle_returns400` — confirms validation actually runs
- `createAndRetrieveTask_endToEnd` — catches wiring bugs no unit test can see

---

## What I did NOT test (and why — interview ammunition)

- Code coverage targets — coverage is a vanity metric until the team uses it daily
- Testcontainers — H2 is fine for v1; the seam is the repository interface, not the DB
- Mutation testing — overkill for a 6-test suite
- Performance tests — no SLAs at this stage

(reading these out loud is part of the interview prep)
