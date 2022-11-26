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
            53, // TODO
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
            46, // TODO
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
            7, // TODO
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
            "Right. Right has to be right, right? You are going on pure instinct now, the fog is too thick. You try your best to quicken your pace. It takes incredible core strength to balance yourself as you hop. You really wish you had completed all those “30 days to build a strong core” challenges.",
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
            "You’ve been hopping/limping for half an hour. The fog is so thick you can’t see past your feet. As you go on, the forest floor is softer, it feels more like grass than the typical rough layer of branches, bark and leaves. This is good, maybe you’ve made it out of the forest into something more like a meadow.",
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
            "Suddenly, a voice booms around you. “WHO'S THERE!” It sounds like it's coming from all around you. OH NO, what did you do?",
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
            "“HOW DARE YOU ENTER THE SANCTUM OF ELMER?!”. Elmer, like the guy from bugs bunny??! No, no, you must’ve wandered into someone’s backyard. But who lives here, and who talks like that.",
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
            "The fog starts to dissipate. You try to make as little noise as possible. There are loud footsteps coming towards you. As the fog clears, you look around. It seems like you are in a dimly lit hallway, the walls are a thick barrier of tree branches that go up really high. There is no ceiling.",
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
            "The floor is soft green grass. About 20 feet in front of you is a turn, that’s where the footsteps are coming from. Behind you is the path you came by. You can make out the outline of an entrance, but can’t see past it. You must have just entered this place.\n",
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
            "\"“Hey, psst”, someone whispers on your left. You are so scared you don’t even scream. You see an opening to the left of you but you can’t see the person speaking.\n" +
                    "\n" +
                    "“Listen, we have to be fast, Elmer is coming for you. Follow me and I can help you get out” the voice whispers.\n" +
                    "\"",
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
            "\"\n" +
                    "“Why can’t we go through the entrance back there?” you ask.\n" +
                    "\n" +
                    "“It’s not safe, they will catch you as soon as you reach the entrance. C’mon, we have to go”\n" +
                    "\n" +
                    "The footsteps are getting closer, do you...\n" +
                    "\"",
            R.drawable.trees_story,
            "Run for the entrance?",
            "Follow the voice",
            1,
            9,
            true,
            false,
            ""
        ),
        Screen(
            "You are pretty sure you shouldn’t trust voices from the walls. You have too much adrenaline to feel your ankle anymore. You run towards the entrance. You are so close, there’s a glimmer of light outside. \n" +
                    "\n" +
                    "Almost there.",
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
            "Something circles around your waist and pulls you back. “HAHAHA, YOU THOUGHT YOU COULD ESCAPE”, Elmer says. You are dragged backwards through the hallway, going deeper into this person’s house. You try to fight the ties that bind you but they are too strong. ",
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
            "\"Finally, you stop. You have reached a room of some sort. Elmer pulls you into the room and you fall to the ground.\n" +
                    "\n" +
                    "As you get up, you realize you are surrounded. There are eyes all around the room, watching you. Elmer stands in front. You look up to face him.\"",
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
            "\"Is that.. Is that a tree? “I am ELMER, the mighty elm tree of this forest”, Elmer says. All around you the trees start to appear out of the shadows. They all have two tree trunks for legs and branches for hand. \n" +
                    "\n" +
                    "You must be going crazy. “Are trees really sentient?” you ask.\n" +
                    "\"",
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
            "“Yes, we trees have always been sentient, now the humans have ruined our world and it is time for us to rise up. Just as we trees are trapped in the world you humans have created, so have you been trapped in my house. I will take my revenge” Elmer says",
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
            "\"“This is our world, the humans and all the animals were made to serve as fertilizer for our growth. It was a good system, we feed you and then you provide us food in turn when you die. BUT YOU WRECKED IT” \n" +
                    "\n" +
                    "You see that Elmer has clearly been waiting to give this speech, there is no stopping him now. \"",
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
            "“Humans altered the balance of the ecosystem. Mass produced and taken our crop against our will. I will no longer stand by and watch the world burn. There are too many humans and I have decided to do something about it. Any human that enters my forest, will never leave alive” Elmer says and then smiles at you.\n",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 2
            "\"Frick Frack, is there any way to get out of this. The trees are closing in, Elmer still has you tied up with the vines. \n" +
                    "\n" +
                    "More vines close around, they are pulling you to the floor. This is the end, you are not going to make it. You should’ve stayed home today, you knew hiking was a bad decision.\"",
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