# [team name] Design Document

## Instructions

*Save a copy of this template for your team in the same folder that contains
this template.*

*Replace italicized text (including this text!) with details of the design you
are proposing for your team project. (Your replacement text shouldn't be in
italics)*

*You should take a look at the example design document in the same folder as
this template for more guidance on the types of information to capture, and the
level of detail to aim for.*

## *Project Title* Design

## 1. Problem Statement
Creating an application to gamifying your life for yourself and your family. 
To better organize and encourage participation in accomplishing daily life goals.


## 2. Top Questions to Resolve in Review

1.   How do I motivate myself to create healthy habits?
2.   How do I motivate my family to accomplish tasks and goals?
3.   How do I reliably remind myself of things I need to do in the future?
4.   How do I have a cool customizable avatar that shows I have earned a lot of currency?
 

## 3. Use Cases

*This is where we work backwards from the customer and define what our customers
would like to do (and why). You may also include use cases for yourselves, or
for the organization providing the product to customers.*


As a GYST customer, I want to be reminded of things I have planned.
As a GYST customer, I want to receive gold coins when I achieve my goals.
As a GYST customer, I want to buy things with my gold coins such as items for my avatar or rewards in real life.
As a GYST customer, I want to interact with other users to accomplish quests together.

## 4. Project Scope

*Clarify which parts of the problem you intend to solve. It helps reviewers know
what questions to ask to make sure you are solving for what you say and stops
discussions from getting sidetracked by aspects you do not intend to handle in
your design.*

- **Project Name:** G.Y.S.T. Get Your Stuff Together
- **Project Goal:** To create a productivity app that helps users stay organized and motivated.
- **Functional Requirements:**
  - The app must allow users to create and manage to-do lists.
  - The app must allow users to set goals and track their progress.
  - The app must allow users to earn gold coins for achieving goals.
  - The app must allow users to spend gold coins on items for their avatar or real-world rewards.
  - The app must allow users to interact with other users to accomplish quests together.
- **Non-Functional Requirements:**
  - The app must be available on both iOS and Android devices.
  - The app must be secure and protect users' data.
  - The app must be user-friendly and easy to use.

### 4.1. In Scope
*Which parts of the problem defined in Sections 1 and 3 will you solve with this
design?*

We will solve problems 1 and 2 by creating a currency and a store where you can choose among predefined items or create custom items you can buy with the currency. There will also be a combo system where if you are achieving your goals many times in a row you will receive extra currency. We will also add competition by adding the ability to interact with other users and share goals to compete on who gets the most points.
We will solve problem 3 by adding a calendar system where you will be able to record dates and when important events will be taking place.
We will solve problem 4 by adding a rewards section where the user can redeem predefined rewards or other items.


### 4.2. Out of Scope
*Based on your problem description in Sections 1 and 3, are there any aspects
you are not planning to solve? Do potential expansions or related problems occur
to you that you want to explicitly say you are not worrying about now? Feel free
to put anything here that you think your team can't accomplish in the unit, but
would love to do with more time.*

- **Non-Functional Requirements:**
    - The app must be available on both iOS and Android devices.
    - The app must be secure and protect users' data.
    - The app must be user-friendly and easy to use.

# 5. Proposed Architecture Overview

*Describe broadly how you are proposing to solve for the requirements you
described in Section 3.*

*This may include class diagram(s) showing what components you are planning to
build.*

*You should argue why this architecture (organization of components) is
reasonable. That is, why it represents a good data flow and a good separation of
concerns. Where applicable, argue why this architecture satisfies the stated
requirements.*

# 6. API

## 6.1. Public Models

*Define the data models your service will expose in its responses via your
*`-Model`* package. These will be equivalent to the *`PlaylistModel`* and
*`SongModel`* from the Unit 3 project.*

**Models**
- UserModel
- QuestModel
- RewardModel
- TaskModel
- 

## 6.2. *First Endpoint*

*Describe the behavior of the first endpoint you will build into your service
API. This should include what data it requires, what data it returns, and how it
will handle any known failure cases. You should also include a sequence diagram
showing how a user interaction goes from user to website to service to database,
and back. This first endpoint can serve as a template for subsequent endpoints.
(If there is a significant difference on a subsequent endpoint, review that with
your team before building it!)*

*(You should have a separate section for each of the endpoints you are expecting
to build...)*

## 6.3 *Second Endpoint*

*(repeat, but you can use shorthand here, indicating what is different, likely
primarily the data in/out and error conditions. If the sequence diagram is
nearly identical, you can say in a few words how it is the same/different from
the first endpoint)*

# 7. Tables

*Define the DynamoDB tables you will need for the data your service will use. It
may be helpful to first think of what objects your service will need, then
translate that to a table structure, like with the *`Playlist` POJO* versus the
`playlists` table in the Unit 3 project.*

**Tables**
- users
- quests
- tasks
- rewards


# 8. Pages

*Include mock-ups of the web pages you expect to build. These can be as
sophisticated as mockups/wireframes using drawing software, or as simple as
hand-drawn pictures that represent the key customer-facing components of the
pages. It should be clear what the interactions will be on the page, especially
where customers enter and submit data. You may want to accompany the mockups
with some description of behaviors of the page (e.g. “When customer submits the
submit-dog-photo button, the customer is sent to the doggie detail page”)*
