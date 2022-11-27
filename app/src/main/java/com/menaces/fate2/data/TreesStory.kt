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
            "Right. Right has to be right, right? You are going on pure instinct now, the " +
                    "fog is too thick. You try your best to quicken your pace. It takes incredible " +
                    "core strength to balance yourself as you hop. You really wish you had completed " +
                    "all those “30 days to build a strong core” challenges.",
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
            "You’ve been hopping/limping for half an hour. The fog is so thick you can’t " +
                    "see past your feet. As you go on, the forest floor is softer, it feels more " +
                    "like grass than the typical rough layer of branches, bark and leaves. This is " +
                    "good, maybe you’ve made it out of the forest into something more like a meadow.",
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
            "Suddenly, a voice booms around you. “WHO'S THERE!” It sounds like it's " +
                    "coming from all around you. OH NO, what did you do?",
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
            "“HOW DARE YOU ENTER THE SANCTUM OF ELMER?!”. Elmer, like the guy from bugs " +
                    "bunny??! No, no, you must’ve wandered into someone’s backyard. But who " +
                    "lives here, and who talks like that.",
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
            "The fog starts to dissipate. You try to make as little noise as possible. " +
                    "There are loud footsteps coming towards you. As the fog clears, you look " +
                    "around. It seems like you are in a dimly lit hallway, the walls are a thick " +
                    "barrier of tree branches that go up really high. There is no ceiling.",
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
            "The floor is soft green grass. About 20 feet in front of you is a turn, " +
                    "that’s where the footsteps are coming from. Behind you is the path you " +
                    "came by. You can make out the outline of an entrance, but can’t see past " +
                    "it. You must have just entered this place.\n",
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
            "“Hey, psst”, someone whispers on your left. You are so scared you don’t " +
                    "even scream. You see an opening to the left of you but you can’t see the " +
                    "person speaking.\n" +
                    "\n" +
                    "“Listen, we have to be fast, Elmer is coming for you. Follow me and I can " +
                    "help you get out” the voice whispers.",
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
                "“Why can’t we go through the entrance back there?” you ask.\n" +
                    "\n" +
                    "“It’s not safe, they will catch you as soon as you reach the entrance. " +
                    "C’mon, we have to go”\n" +
                    "\n" +
                    "The footsteps are getting closer, do you...\n",
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
            "You are pretty sure you shouldn’t trust voices from the walls. You have " +
                    "too much adrenaline to feel your ankle anymore. You run towards the " +
                    "entrance. You are so close, there’s a glimmer of light outside. \n" +
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
            "Something circles around your waist and pulls you back. “HAHAHA, " +
                    "YOU THOUGHT YOU COULD ESCAPE”, Elmer says. You are dragged backwards " +
                    "through the hallway, going deeper into this person’s house. You try to " +
                    "fight the ties that bind you but they are too strong. ",
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
            "Finally, you stop. You have reached a room of some sort. Elmer pulls " +
                    "you into the room and you fall to the ground.\n" +
                    "\n" +
                    "As you get up, you realize you are surrounded. There are eyes all around " +
                    "the room, watching you. Elmer stands in front. You look up to face him.",
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
            "Is that.. Is that a tree? “I am ELMER, the mighty elm tree of this " +
                    "forest”, Elmer says. All around you the trees start to appear out of " +
                    "the shadows. They all have two tree trunks for legs and branches for hand. \n" +
                    "\n" +
                    "You must be going crazy. “Are trees really sentient?” you ask.\n",
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
            "“Yes, we trees have always been sentient, now the humans have ruined " +
                    "our world and it is time for us to rise up. Just as we trees are trapped " +
                    "in the world you humans have created, so have you been trapped in my " +
                    "house. I will take my revenge” Elmer says",
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
            "“This is our world, the humans and all the animals were made to serve " +
                    "as fertilizer for our growth. It was a good system, we feed you and then " +
                    "you provide us food in turn when you die. BUT YOU WRECKED IT” \n" +
                    "\n" +
                    "You see that Elmer has clearly been waiting to give this speech, there is " +
                    "no stopping him now.“",
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
            "“Humans altered the balance of the ecosystem. Mass produced and taken our " +
                    "crop against our will. I will no longer stand by and watch the world burn. " +
                    "There are too many humans and I have decided to do something about it. Any " +
                    "human that enters my forest, will never leave alive” Elmer says and " +
                    "then smiles at you.\n",
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
            "Frick Frack, is there any way to get out of this. The trees are closing " +
                    "in, Elmer still has you tied up with the vines. \n" +
                    "\n" +
                    "More vines close around, they are pulling you to the floor. This is the end, " +
                    "you are not going to make it. You should’ve stayed home today, you knew " +
                    "hiking was a bad decision.",
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
            "“Okay, I’ll follow you” you say.  What do you have to lose, you can’t walk " +
                    "anyway. You go through the opening. You look at the person who helped you, " +
                    "no wait, not a person, it's a tree!",
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
            "“Hey, we got to move fast, I see hurt, I made this walking stick out of " +
                    "my branches for you, this should help a bit”, the tree says. You take the " +
                    "branch and follow him.  \n",
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
            "Whoa, this is a lot, maybe it is a person dressed in a tree costume. As " +
                    "you try to keep up, you have to know, you ask him “Are you a tree?”. “Oh, " +
                    "yeah, you’ve probably never seen a talking tree before,  let’s go a little " +
                    "further and I’ll tell you the whole story” he says.",
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
            "The stick helps a lot, but you are still struggling to move at a " +
                    "respectable pace. After a bit, you get to a fork in the path and  the " +
                    "tree stops, “I think we lost his trail, we have to keep moving but we " +
                    "can stop here for a bit”, he says.",
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
            "“Well, I guess it’s time for introductions, my name is Treevor. I saw " +
                    "you enter the garden and I figured you were lost. Elmer is a great tree " +
                    "and hates humans, I thought I would give you a hand”\n" +
                    "\n" +
                    "You sink to the floor. This is too much, you need to sit down. How " +
                    "could the tree be talking, how could it be moving. You pinch yourself, " +
                    "you aren’t dreaming. You look up at Treevor. “You gotta tell me more, " +
                    "how is this possible.“",
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
            "“Okay, we have a couple of minutes. All trees are sentient, we are " +
                    "aware of humans and their actions. We have hidden this from humans for " +
                    "years, most trees choose to just chill out and not move, or even if we " +
                    "move it's not in the presence of humans. Older trees have these sanctums " +
                    "throughout this forest where they just do what they want.“ Treev says\n",
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
            "“Anyways, we should get going now, there are two paths, one has stairs but " +
                    "is faster and the other is a ramp but it is a longer route, which do you feel " +
                    "is better?”\n" +
                    "\n" +
                    "You are still confused, but Treevor is right, you need to leave. Which way " +
                    "do you go?\n",
            R.drawable.trees_story,
            "Down the ramp",
            "Up the stairs",
            1,
            5, // TODO
            true,
            false,
            ""
        ),
        Screen(
            "“Let’s do the ramp” you say. Even with the stick you might not be able to " +
                    "climb stairs. You and Treevor head down the ramp. You lead the way and " +
                    "Treevor follows behind you making sure that no one is following you guys.",
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
            "After a while you start to feel a little unsure about this, it feels like " +
                    "you are going deeper into this place. “Treev, are you sure about this ?” " +
                    "you ask. No response. “Treevor? TREEVOR!?” Where is he?\n" +
                    "\n" +
                    "Something knocks you behind your knees. You fall and try to get up but " +
                    "your walking stick falls out of your hand. Something kicks you while you " +
                    "are down, the ramp is too steep, you roll down and you can’t stop.",
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
            "Treevor comes up behind you. “Now you have nowhere to run, '' he says. " +
                    "You can’t believe you’ve fallen for his trap. “Treevor, please, you got to " +
                    "let me go '', you plead. “Never, humans frequently use trees without " +
                    "caring if it hurts them. Those trees you marked, those were my friends! " +
                    "Birchrard and Patreecia will never be the same again, you will feel our wrath!”",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 3
            "The trees gang up on you. They barrage you with splinters. It’s like a " +
                    "thousand paper cuts at the same time. You close your eyes and think, if " +
                    "only you didn’t go hiking today. ",
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
            "The stairs: “I’m good with the stairs” you say. You want to get out of here " +
                    "as soon as possible. Even if your ankle gets wrecked. You hobble towards the " +
                    "stairs and start climbing. “Hey, how about I carry you up, it will be much " +
                    "faster” Treevor says.",
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
            "Treevor sweeps you off your feet and carries you bridal style up the stairs. Whoa this feels wonderful! You are almost at the top of the stairs when you hear screaming. You turn back and Treevor smiles at you.",
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
            "You look back at Treevor, what is happening? Oh no, oh no, oh no. This was " +
                    "a trap. You try to squirm out of Treevor’s branches but they are too strong. " +
                    "“Treevor, how could you do this to me?” you cry out.",
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
            "“How could I, how could you! After all trees do for humans, you turn around " +
                    "and cut us down, commoditize our crops and turn us into mere resources. I " +
                    "think humans need to feel what it's like to be exploited” Trevor replies " +
                    "as he takes you into an area with a giant pool in the middle.",
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
            "On the edge of the pool, tied up and guarded by some other trees are " +
                    "Bro Ski and Bra Ski, tied up with branches. This is bad, real bad.\n" +
                    "\n" +
                    "Treevor drops you down next to the Skis. You can barely walk, there’s no " +
                    "chance of escaping. You have been betreeyed.",
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
            "“We left the signs, telling you to get out of here. We really hoped " +
                    "you made it out alive” Bra Ski said. “Something started chasing us while " +
                    "we were waiting for you, I think they lured us here and now they are going " +
                    "to do something terrible” Bro Ski says",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 4
            "Treevor towers over you, “Have you heard of logrolling? I think it’s time " +
                    "we try human rolling. HAHAA'' All the other trees start laughing as well. " +
                    "They bind you up with their branches and toss you all into the water. You " +
                    "start crying, Trees are the worst.",
            R.drawable.trees_story,
            "",
            "",
            0,
            0,
            false,
            true,
            ""
        ),
        Screen(
            "You have to take a break. You slump down and rest your back against a tree. " +
                    "You rummage through your pockets, there must be painkillers somewhere.",
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
            "Ah ha! You found some ibuprofen. Sometimes, it pays off to never empty " +
                    "your pockets. Your ankle actually isn’t as bad as you thought, you should " +
                    "be better after you pop your pills.\n" +
                    "\n" +
                    "You lean your head against the tree and something compels you to close your " +
                    "eyes. Wait, no, stay awake! You can’t open your eyes, you feel drowsy and " +
                    "then everything turns black.",
            R.drawable.trees_story,
            "",
            "",
            7,
            0,
            false,
            false,
            ""
        ),
        Screen(
            "Who are you kidding, you can’t make it out on your own. You would probably " +
                    "die in a variety of ways. Your best shot at survival is getting back with " +
                    "Bro Ski and Bra Ski. They couldn’t have gone far. You go down the trail " +
                    "you think they took.",
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
            "“Bro Skiii!! Bra skiii!!” you yell out. Where did they go? The better " +
                    "not be joshing around, they know you hate being alone in the woods.\n" +
                    "\n" +
                    "You hear a reply to your shouts. “HELP! HELP ME!!”. That sounded like Bra " +
                    "Ski but not quite. The cries are coming from up ahead.\n",
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
            "You sprint towards the noises you heard. The noise keeps getting further. " +
                    "Everytime you think you have reached them it moves further up ahead. \n" +
                    "\n" +
                    "There! That clearing up ahead, you’re sure it's coming from there. It’s " +
                    "getting louder, you’re almost there. You break into the clearing and do " +
                    "a 360 degree scan. You just see a raven perched on one of the trees. " +
                    "Where is Bra Ski?\n",
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
            "You hear something move behind you. There must be animals in the forest; " +
                    "that definitely sounded more like an animal than a human. You have to " +
                    "get out of this clearing, it’s too open. \n" +
                    "\n" +
                    "Do you -> Hide or Run \n",
            R.drawable.trees_story,
            "Hide",
            "Run",
            1,
            19,
            true,
            false,
            ""
        ),
        Screen(
            "You decide to hide. If the creature had already seen you, it would’ve " +
                    "attacked. You don’t want to make more noise by running so maybe you can " +
                    "hide behind a tree and hope for the best. You tiptoe towards the nearest " +
                    "tree, like a ninja. All those years of karate are finally paying off.",
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
            "You hold your breath and press your back against the tree. You look up " +
                    "and the raven is watching you intently with its dark brown eyes. It swoops " +
                    "towards you. It’s too fast, you can’t run. \n" +
                    "\n" +
                    "Those eyes are the last things you see before falling backwards and " +
                    "everything goes dark.\n",
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
            "You wake up feeling groggy. Your head hurts, you must have hit it on " +
                    "something. A loud voice booms around you. “HELLO PUNY HUMAN. WELCOME " +
                    "TO MY LAIR”. Okay, you are pretty sure only cartoon villains have “lairs”.",
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
            "You look around. You seem to be trapped. There are bars all around " +
                    "you and a wooden swing? HOLY GUACAMOLE, you are in a giant bird cage. " +
                    "It’s like a bird cage made specifically for humans.\n" +
                    "\n" +
                    "“Who was that ?!” you yell out, trying to sound like you’re not scared.\n",
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
            "The space lights up. You are in a large hall and in front of you is a .. " +
                    "tree? A really really big tree. \n" +
                    "\n" +
                    "“I am Katreena, the mighty oak tree of the forest, and you have been " +
                    "captured by my minions”, the tree says.\n" +
                    "\n" +
                    "Oh great, a talking tree, that’s just what you needed today. Well, I guess " +
                    "it’s time for the classic villain monologue so you might as well take a seat.\n",
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
            "As you suspected, Katreena launches into a speech. “I am tired of watching " +
                    "while humans destroy our world. We used to have a symbiotic relationship " +
                    "but now the humans just take and take and take without any thought of the " +
                    "harm they cause. I’ve watched my brethren fall just to make land for mass " +
                    "production of cattle.“",
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
            "“I will not stand for this any longer!! I have big plans to change the way " +
                    "humans behave, but first you tell me. What do you think of my motivations, " +
                    "haven’t humans harmed the trees for too long?“\n" +
                    "\n" +
                    "Do you agree or disagree?",
            R.drawable.trees_story,
            "Agree",
            "Disagree",
            1,
            6,
            true,
            false,
            ""
        ),
        Screen(
            "Well the tree kinda has a point. You get up to address the tree, “I see " +
                    "where you are coming from. We may have gone a little overboard in these " +
                    "past few years. But! We are trying to change.” \n" +
                    "\n" +
                    "“It's not fast enough! I plan to force the humans to change, whether they " +
                    "like it or not. And you are going to help me. You will become one of my " +
                    "minions and serve my agenda.” Katreena says as she breaks out into a smile. \n",
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
            "“Me, noo, not me. I have zero strategy skills. I once lost a board " +
                    "game against my cat, I’m that bad” you try to argue. \n" +
                    "\n" +
                    "“Ofcourse, I knew that from the moment I met you, but I need all the " +
                    "manpower I can get. Let me introduce you to my supreme commander” Katreena says\n",
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
            "With that, you hear loud steps coming towards the room. You try to make " +
                    "a break for it, can the tree run after you? Might as well try. You slam " +
                    "against the bars but they are too thick. \n" +
                    "\n" +
                    "The steps are louder. You get goosebumps. It's getting closer, It's almost " +
                    "there. THUD THUD. The supreme commander enters the room. \n",
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
            "“Is that a pigeon??!”, you exclaim. \n" +
                    "\n" +
                    "“Yes, the birds are my most valuable assets. They spy on the humans for me " +
                    "and inform me about their behavior. You however will perform other tasks. " +
                    "You will target humans who are working to harm the environment and " +
                    "contributing to climate change. You will steal bad food from humans. You " +
                    "will stay outside the windows of particularly troublesome humans and wake " +
                    "them up at 4 am with your noise. You will be given the orders and you won't " +
                    "be able to stop yourself from carrying them out.” Katreena explains \n",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 5
            "The supreme commander stares at you and lets out a loud cry. You can " +
                    "feel yourself transforming. You shrink down, your arms become wings, " +
                    "your entire body is burning with pain. \n" +
                    "\n" +
                    "Then it ends and you only have one thing on your mind - squawk.",
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
            "This seems a little too extreme. “No, I don't think this is the right way. " +
                    "How are you planning to change the way humans behave anyway?” you say. \n" +
                    "\n" +
                    "“Hahaha, what a perfect question because you will be one of my first " +
                    "experiments.” Katreena says evilly.\n",
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
            "Vines shoot out from around you and tie you down. You can’t move any part " +
                    "of your body. You’re stuck. \n" +
                    "\n" +
                    "Katreena comes over to you and says “I have a great idea. I have been " +
                    "working on this fruit that can brainwash any creature that tastes it, " +
                    "you have the pleasure of being my first victim”\n",
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
            "You start screaming, maybe that will distract Katreena. You kick your legs " +
                    "and wriggle your body. But everytime one tie snaps another just grows in " +
                    "its place. You can’t leave.",
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
            "Katreena smiles. “I will make it so that you forget all about this place " +
                    "and only remember what I tell you. You will get an intense fear when you " +
                    "do anything that harms trees. You will join climate activists and campaign " +
                    "with them. You will become vegan”\n" +
                    "\n" +
                    "“No, not vegan! That is a fate far worse than death!” You cry out.\n" +
                    "\n" +
                    "Katreena just laughs and forces you to eat the strange fruit.\n",
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
            "Bro Ski and Bra Ski found you in the parking lot three days later. You " +
                    "don’t know what happened in those three days but what you do know is you " +
                    "have to change your lifestyle.",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 6
            "You throw out all your meat products. Everything you buy is sustainably " +
                    "made. You feed the birds. You don’t know why, but it feels like the right " +
                    "thing to do. \n" +
                    "\n" +
                    "Every now and then you get a strange feeling, trees, are they friends or foes?\n",
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
            "\"Run: You book it out of there. Whatever is out there is probably much faster than you, you need the lead. You run towards the trees away from the sound you heard. You run as fast as you can, you feel like your heart is going to burst out of your chest. You barely watch where you are going.\n" +
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
            "\"Suddenly you are falling. You hit some dirt and start sliding down the rest of the way. Frick frack, there was a trap and you ran straight into it. You are going so fast that your fingers burn when you try to stop yourself. \n" +
                    "\n" +
                    "You keep sliding down, are you ever going to stop.\n" +
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
            "It felt like you were falling forever. You finally hit the ground and slide across the floor. Before you can move, someone grabs you and ties you hands and feet. “We caught another one!” they say. They lift you up and start marching down the underground tunnel. ",
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
            "“Let me go!” You scream and try to break free. As your eyes adjust to the darkness, you start to see the stuff around you. There’s a long corridor with great wooden sculptures adorning the sides. “Whoa this is some really nice art work” you say to yourself. “Thanks, I made some of them with my branches” your captor replies. Wait, did they say branches??!\n",
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
            "You arrive at an underground dome. “My queen, we have another”, The captor tosses you to the floor. “Thank you Palmela”, the queen replies. You look around, there are trees surrounding the entire dome, you are in the middle of the dome, in front of a much bigger tree than the rest. The queen presumably.  ",
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
            "\"Are the trees talking, is that a thing? Maybe you just don’t go hiking enough, but surely you would have heard stories. \n" +
                    "\n" +
                    "“You humans are so simple, you have fallen into my trap like a silly goose” The queen says\n" +
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
            "“Where am I ? What do you want from me?” you ask. “You are in my palace, I am queen Beatreece, a great redwood tree. You humans are mere fertilizer and yet manage to cause so much trouble. We work hard to keep the ecosystem in balance but you humans put so much carbon dioxide in the air that it's all for nothing. You will have to pay for the crimes of humanity”",
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
            "This doesn’t sound good. The tree is clearly ready to kill you. You have to think of a way to get out of this. You have a swiss knife in one of your pockets. Maybe you could try to get the ropes at your feet and then run back the way you came. You would have to be super fast though.\n",
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
            "\"Perhaps, you could try negotiating with the queen. Convince her that not all humans are bad. \n" +
                    "\n" +
                    "Think fast, are you going to:\n" +
                    "\"",
            R.drawable.trees_story,
            "Negotiate",
            "Escape",
            1,
            4,
            true,
            false,
            ""
        ),
        Screen(
            "You were your highschool debate champion. You once bargained for a 90% discount at Ralph Lauren, you can do it. “My queen, I ..”, you start to say. “DID I GIVE YOU PERMISSION TO TALK?” the queen roars. “Put him in the prison with the other, let’s give them a taste of human treatment”. The henchmen march behind you and carry you out of the dome room. ",
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
            "\"What does tree prison even look like, will it have a bathroom?\n" +
                    "\n" +
                    "You get to the cell and see your two friends already tied up. Fiddlesticks! They got the Skis as well. You are tossed quite roughly into the cell. \n" +
                    "\n" +
                    "“Bro Ski, Bra Ski. I thought I would never see you again! How did you get here?” you say. \n" +
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
        Screen( // ENDING 7
            "\"“We fell into the trap as well. The queen got quite mad at us and plans to keep us here forever. We tried to break the bars but we couldn't, our knives won’t cut through this wood” Bra Ski says.  \n" +
                    "\n" +
                    "Looks like you are stuck in the dungeons of an old queen. You always had a feeling trees were evil, you should have trusted your instincts and not gone hiking!\n" +
                    "\"",
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
            "“What’s that!” You yell, looking at the ceiling. All the trees look up as well. This is your chance, you reach in your pocket, take your knife and slice through the vines around you. The queen doesn’t run after you but the henchmen start coming for you. ",
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
            "You run towards the entrance, the trees see where you are headed and try to block it. They are all trying to tackle but you manage to dodge their attacks. You’re almost there, the exit is a couple of feet away. ",
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
            "\"Nothing happens. You open your eyes and there is a tree standing in front of you, protecting you. He is incredibly fast, he fights off the other trees, then grabs you from the floor and dashes for the entrance. The tree veers right and starts down a different corridor from which you came.\n" +
                    "\n" +
                    "Who is this mystery tree, or is it a mystree?\"",
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
            "“Hey, I’m Patreeck by the way. I’m going to get you out of here even if it's the last thing I do” the tree says. You are too stunned to speak. So much is happening. “I used to be a high ranking officer, I was the branch manager for the queen but I couldn't take it anymore. She’s gone too far with her ideas. I couldn’t save the others but I’m going to make sure you survive”.\n",
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
            "\"By others you have a sinking feeling that he means Bro Ski and Bra Ski. You don't have time to dwell on that right now\n" +
                    "\n" +
                    "You see a fork in the path coming up. \n" +
                    "\n" +
                    "“I’m not sure which way to go, just choose one and we’ll stick with it” Patreeck says to you\n" +
                    "\n" +
                    "Do you go:\"",
            R.drawable.trees_story,
            "Left",
            "Right",
            1,
            4,
            true,
            false,
            ""
        ),
        Screen(
            "“LEFT!” you yell. Patreeck takes you both through the left corridor. You hear steps approaching, the trees are catching up to you guys. You are running, you see the exit. It's the light at the end of the tunnel. The trees are close on your heels.",
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
            "\" “Hey, I don’t think we are going to make it out. I will toss you towards the entrance and I’ll stay back and fight, '' he says.\n" +
                    "\n" +
                    " “Patreeck, no, don’t leave me!” you say. Patreeck nudges you to the entrance and turns his back to you to fight the trees. \n" +
                    "\n" +
                    "“Run, stay safe. Bye brochacho”. You run to the exit.\n" +
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
        Screen( // ENDING 8
            "\"You manage to get out of the woods. They never find Bro Ski and Bra Ski so you assume the crazy trees got them. It’s too hard to even think about Patreeck. You go home and decide to do everything you can to save the trees. For Patreeck's sake.\n" +
                    "\"",
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
            "“RIGHT!” you shout. Patreeck shifts you to a higher branch and you head down the right corridor. Patreeck takes a stone and throws it down the left corridor while you both hide. The trees arrive at the fork a couple of seconds later and follow the noise from the left. You breathe a sigh of relief. \n",
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
            "“It won’t keep them long, we should get going” Patreeck says. Once you are certain all the trees have past y’all, Patreeck runs down the corridor. You manage to reach the exit! You made it!",
            R.drawable.trees_story,
            "",
            "",
            1,
            0,
            false,
            false,
            ""
        ),
        Screen( // ENDING 9 (FINAL ENDING)
            "\"“I’m sorry about your friends, but I’m glad you made it out okay!” \n" +
                    "\n" +
                    "Are you okay though? You don’t think your life will ever be the same.\"",
            R.drawable.trees_story,
            "Return to home",
            "",
            1,
            0,
            false,
            true,
            ""
        ),
    )

}