package com.menaces.fate2.data

import com.menaces.fate2.R
import com.menaces.fate2.model.Screen

object TreesStory {

    val screens: List<Screen> = listOf(
        Screen(
            "Go hiking, they said, It will be fun, they said, but those lying liars lied " +
                    "to you and now you are stuck in the middle of the woods.",
            R.drawable.tm_hiking_0,
            "",
            "",
            1,
            0,
            false,
            false,
            "hiking with three people"
        ),
        Screen(
            "It all started this morning. It was supposed to be a chill weekend but your " +
                    "two best friends, Bro Ski and Bra Ski, talked you into hiking through the " +
                    "spoon valley forest.",
            R.drawable.tm_hiking_0,
            "",
            "",
            1,
            0,
            false,
            false,
            "hiking with three people"
        ),
        Screen(
            "Spoon valley is, you guessed it, shaped like a spoon. It’s not your typical " +
                    "hiking spot since it doesn’t have well mapped trails but apparently the views " +
                    "at the tip of the spoon are legendary.",
            R.drawable.tm_hiking_0,
            "",
            "",
            1,
            0,
            false,
            false,
            "hiking with three people"
        ),
        Screen(
            "Y’all were a couple of miles in passing by some Elm trees when a gust of " +
                    "wind came out of nowhere and blew your hat away. “I’ll get it, you guys " +
                    "wait here”, you said and ran after your hat. The wind carried your hat a " +
                    "couple of yards away into a clearing. Just as you bent down to get it, a " +
                    "bird swooped in and flew away with your hat.",
            R.drawable.tm_hat_blown_1,
            "",
            "",
            1,
            0,
            false,
            false,
            "hat blowing away"
        ),
        Screen( // CHOICE
            "Frustrated, you make your way back to the Skis only to find them gone. " +
                    "Now here you are, in the middle of the woods, alone, without cell service " +
                    "and hatless. Can this day get any worse, you sigh. What should you do?",
            R.drawable.tm_middle_of_forest_2,
            "Retrace your steps",
            "Try to find your friends",
            1,
            0, // TODO
            true,
            false,
            "in the middle of the forest"
        ),
        Screen(
            "Bro Ski and Bra Ski are seasoned hikers, they will make " +
                    "their way around. But you, no chance, you made a couple of markings on the " +
                    "trees on your way in, hopefully you can follow those out and get help if needed. ",
            R.drawable.tm_middle_of_forest_2,
            "",
            "",
            1,
            0,
            false,
            false,
            "in the middle of the forest"
        ),
        Screen(
            "You head back the way you came looking out for the little x’s you drew on " +
                    "the trees. As you keep going, you come to the realization that the woods are " +
                    "much scarier when you are on your own. Everything looks familiar and " +
                    "different at the same time.",
            R.drawable.tm_scary_woods_3,
            "",
            "",
            1,
            0,
            false,
            false,
            "creepy-looking woods"
        ),
        Screen(
            "You stop for a minute, it’s quiet, too quiet and you get an eerie feeling " +
                    "that someone’s watching you. You do a scan around, no one in sight.\n" +
                    "\n" +
                    "Just as you are about to get started again, you hear a loud thud as something " +
                    "falls behind you.",
            R.drawable.tm_someone_thing_watching_4,
            "",
            "",
            1,
            0,
            false,
            false,
            "eyes watching from the woods"
        ),
        Screen(
            "“Hello?!” you cry out as you spin around. You see a branch on the ground, " +
                    "it probably fell right now. It's just a branch you try to calm yourself " +
                    "down. However you can’t help but think, if you had stopped a couple of steps " +
                    "earlier, that branch would have landed on your head.\n" +
                    "\n" +
                    "No!, you can’t freak yourself out. You need to stay calm and get out of " +
                    "here. You are pretty tired but you decide to pick up the pace and start jogging.",
            R.drawable.tm_trip_and_fall_5,
            "",
            "",
            1,
            0,
            false,
            false,
            "person tripping and falling"
        ),
        Screen( // CHOICE
            "You are so focused on looking for the markings you forget to look down. " +
                    "BAM! You fall face first into some dirt. You tripped over a tree root, your " +
                    "ankle is twisted in a funny way and you are out of breath. \n" +
                    "\n" +
                    "You could:",
            R.drawable.tm_fall_on_face_6,
            "Hop your way out of the woods",
            "Take a short break",
            1,
            0, // TODO
            true,
            false,
            "person falling on their face"
        ),
        Screen(
            "This is too weird, something is up and you need to " +
                    "get out of this place. It’s going to get dark and after that it would " +
                    "be too hard to find your way out. Panting, you pull yourself up. Your " +
                    "ankle is swollen. Oh shoot, this is going to be harder than you thought.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "You take baby steps. You can barely put any weight on your ankle so you " +
                    "start to hop through the woods. The forest definitely got colder in the " +
                    "last 5 mins and a fine blanket of fog has started to settle in. ",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "Up ahead you see a clearing that you recognize, you had stopped to eat " +
                    "some food there on your way in. You remember marking a tree there. As you " +
                    "get closer, you realize the markings are different from the ones you made. " +
                    "It says something else.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "You limp up to the tree, in all caps you see the word “RUN” engraved on " +
                    "the bark. Wait what, you don’t remember writing that. The engraving looks " +
                    "fresh, maybe it's a warning. This is definitely not cool.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // CHOICE
            "You look around at the other trees, they are all marked as well. " +
                    "“LEAVE”, “GET OUT FAST”. OH NO, this is a bad sign. You start to shake " +
                    "from the cold, the fog is getting thicker. With all these trees marked " +
                    "you don’t know which way to go. \n" +
                    "\n" +
                    "There are two paths that seem reasonable, you have to make a choice:",
            R.drawable.trees_story,
            "Left",
            "Right",
            1,
            0, // TODO
            true,
            false,
            ""
        ),
        Screen(
            "Ever since Angela from 9th grade you’ve lived by the saying “Going " +
                    "left because she never treated me right”. You hop down the left path. If " +
                    "you recall correctly, there is an entrance about 15 minutes from here. " +
                    "It’s not the entrance you came by but there is no point in looking for " +
                    "the markings anyway.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "The forest is getting less dense, which is a good sign. Maybe those " +
                    "markings were just a prank by some kids to scare people passing by. \n" +
                    "\n" +
                    "Are those stairs, YES! You are almost out of the woods.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "You reach the stairs. It’s going to be hell to climb but that's better " +
                    "than spending even one more minute in this haunted forest. The pain " +
                    "shoots through your leg, you grip the rails to pull yourself up. The only " +
                    "thing keeping you going is Miley Cyrus’s song “The climb”. ",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "After forever, you reach the top of the stairs. You’re out. You made it, " +
                    "you call the park rangers and tell them about your situation. They take you " +
                    "to the medical center and head out to look for bro ski and bra ski. \n" +
                    "\n" +
                    "You promise yourself to never go hiking for the rest of your life. Never ever!",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "It’s been 3 months since that day, you head out to meet up with bro ski and " +
                    "bra ski. Brok ski and bra ski were found hours later, shivering from the " +
                    "cold, on the brink of death.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 1 (20)
            "They refuse to talk about what happened. Bra Ski has oddly become " +
                    "vegetarian and Bro Ski  starts crying everytime he sees a bird. Something " +
                    "happened in those woods, aren’t you glad you made all the right choices.",
            R.drawable.trees_story,
            "Return to home",
            "",
            0,
            0,
            false,
            true,
            ""
        ),
        Screen(
            "",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
    )

}