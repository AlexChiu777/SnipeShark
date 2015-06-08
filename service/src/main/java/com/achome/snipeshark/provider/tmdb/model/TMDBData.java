package com.achome.snipeshark.provider.tmdb.model;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by Alex on 6/6/2015.
 */


public class TMDBData {





    public static void main(String[] args) {
        String apiKey = "cfdf0343a5fac678eff09262fc47aa41";

        String json = "{\"backdrop_path\":\"/eSzpy96DwBujGFj0xMbXBcGcfxX.jpg\",\"created_by\":[{\"id\":66633,\"name\":\"Vince Gilligan\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"}],\"episode_run_time\":[45,47],\"first_air_date\":\"2008-01-19\",\"genres\":[{\"id\":18,\"name\":\"Drama\"}],\"homepage\":\"http://www.amctv.com/shows/breaking-bad\",\"id\":1396,\"in_production\":false,\"languages\":[\"en\",\"de\",\"ro\",\"es\",\"fa\"],\"last_air_date\":\"2013-09-29\",\"name\":\"Breaking Bad\",\"networks\":[{\"id\":174,\"name\":\"AMC\"}],\"number_of_episodes\":62,\"number_of_seasons\":5,\"origin_country\":[\"US\"],\"original_language\":\"en\",\"original_name\":\"Breaking Bad\",\"overview\":\"Breaking Bad is an American crime drama television series created and produced by Vince Gilligan. Set and produced in Albuquerque, New Mexico, Breaking Bad is the story of Walter White, a struggling high school chemistry teacher who is diagnosed with inoperable lung cancer at the beginning of the series. He turns to a life of crime, producing and selling methamphetamine, in order to secure his family's financial future before he dies, teaming with his former student, Jesse Pinkman. Heavily serialized, the series is known for positioning its characters in seemingly inextricable corners and has been labeled a contemporary western by its creator.\",\"popularity\":8.23342,\"poster_path\":\"/4yMXf3DW6oCL0lVPZaZM2GypgwE.jpg\",\"production_companies\":[{\"name\":\"Gran Via Productions\",\"id\":2605},{\"name\":\"Sony Pictures Television\",\"id\":11073},{\"name\":\"High Bridge Entertainment\",\"id\":33742}],\"seasons\":[{\"air_date\":\"2009-02-17\",\"episode_count\":6,\"id\":3577,\"poster_path\":\"/AngNuUbXSciwLnUXtdOBHqphxNr.jpg\",\"season_number\":0},{\"air_date\":\"2008-01-19\",\"episode_count\":7,\"id\":3572,\"poster_path\":\"/o5131POxv9xFl3wBmdg0YWc9Iz4.jpg\",\"season_number\":1},{\"air_date\":\"2009-03-08\",\"episode_count\":13,\"id\":3573,\"poster_path\":\"/7FwD7IuyHy6xl18LDIRxjl7vDbo.jpg\",\"season_number\":2},{\"air_date\":\"2010-03-21\",\"episode_count\":13,\"id\":3575,\"poster_path\":\"/1HVSSlEAOILiR4BskS1zV04kTjx.jpg\",\"season_number\":3},{\"air_date\":\"2011-07-17\",\"episode_count\":13,\"id\":3576,\"poster_path\":\"/5p7WduYlIIFjVYUIsqRZLFYWjMc.jpg\",\"season_number\":4},{\"air_date\":\"2012-07-15\",\"episode_count\":16,\"id\":3578,\"poster_path\":\"/r3z70vunihrAkjILQKWHX0G2xzO.jpg\",\"season_number\":5}],\"status\":\"Ended\",\"type\":\"Scripted\",\"vote_average\":9.0,\"vote_count\":229}";
        String json2 = "{\"page\":1,\"results\":[{\"adult\":false,\"backdrop_path\":\"/phszHPFVhPHhMZgo0fWTKBDQsJA.jpg\",\"genre_ids\":[53,28,12],\"id\":76341,\"original_language\":\"en\",\"original_title\":\"Mad Max: Fury Road\",\"overview\":\"An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.\",\"release_date\":\"2015-05-15\",\"poster_path\":\"/kqjL17yufvn9OVLyXYpvtyrFfak.jpg\",\"popularity\":35.029787,\"title\":\"Mad Max: Fury Road\",\"video\":false,\"vote_average\":8.1,\"vote_count\":622},{\"adult\":false,\"backdrop_path\":\"/nfFvCAhLDqwtyfEaQ8uJ6HcN403.jpg\",\"genre_ids\":[28,878,53],\"id\":198184,\"original_language\":\"en\",\"original_title\":\"Chappie\",\"overview\":\"Every child comes into the world full of promise, and none more so than Chappie: he is gifted, special, a prodigy. Like any child, Chappie will come under the influence of his surroundings—some good, some bad—and he will rely on his heart and soul to find his way in the world and become his own man. But there's one thing that makes Chappie different from any one else: he is a robot.\",\"release_date\":\"2015-03-06\",\"poster_path\":\"/saF3HtAduvrP9ytXDxSnQJP3oqx.jpg\",\"popularity\":32.636645,\"title\":\"Chappie\",\"video\":false,\"vote_average\":6.8,\"vote_count\":404},{\"adult\":false,\"backdrop_path\":\"/rFtsE7Lhlc2jRWF7SRAU0fvrveQ.jpg\",\"genre_ids\":[12,878,28],\"id\":99861,\"original_language\":\"en\",\"original_title\":\"Avengers: Age of Ultron\",\"overview\":\"When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth’s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.\",\"release_date\":\"2015-05-01\",\"poster_path\":\"/t90Y3G8UGQp0f0DrP60wRu9gfrH.jpg\",\"popularity\":28.875882,\"title\":\"Avengers: Age of Ultron\",\"video\":false,\"vote_average\":7.9,\"vote_count\":1129},{\"adult\":false,\"backdrop_path\":\"/4liSXBZZdURI0c1Id1zLJo6Z3Gu.jpg\",\"genre_ids\":[878,14,28,12],\"id\":76757,\"original_language\":\"en\",\"original_title\":\"Jupiter Ascending\",\"overview\":\"In a universe where human genetic material is the most precious commodity, an impoverished young Earth woman becomes the key to strategic maneuvers and internal strife within a powerful dynasty…\",\"release_date\":\"2015-02-27\",\"poster_path\":\"/aMEsvTUklw0uZ3gk3Q6lAj6302a.jpg\",\"popularity\":27.454161,\"title\":\"Jupiter Ascending\",\"video\":false,\"vote_average\":5.4,\"vote_count\":624},{\"adult\":false,\"backdrop_path\":\"/3kaKAlAsv44hKJ2JkPsu0kNYEJl.jpg\",\"genre_ids\":[53,27,9648],\"id\":270303,\"original_language\":\"en\",\"original_title\":\"It Follows\",\"overview\":\"For 19-year-old Jay, fall should be about school, boys and weekends out at the lake. But after a seemingly innocent physical encounter, she finds herself plagued by strange visions and the inescapable sense that someone, or something, is following her. Faced with this burden, Jay and her teenage friends must find a way to escape the horrors that seem to be only a few steps behind.\",\"release_date\":\"2014-05-17\",\"poster_path\":\"/4MrwJZr0R9LbyOgZqwLNmtzzxbu.jpg\",\"popularity\":20.580545,\"title\":\"It Follows\",\"video\":false,\"vote_average\":7.0,\"vote_count\":158},{\"adult\":false,\"backdrop_path\":\"/fYk9jYj8XbdMHA6Iz8gJhAm1IgA.jpg\",\"genre_ids\":[28,12,878,53],\"id\":135397,\"original_language\":\"en\",\"original_title\":\"Jurassic World\",\"overview\":\"Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.\",\"release_date\":\"2015-06-12\",\"poster_path\":\"/upknWa3BHdPLsZuVflphdFVBuwU.jpg\",\"popularity\":20.266003,\"title\":\"Jurassic World\",\"video\":false,\"vote_average\":7.0,\"vote_count\":33},{\"adult\":false,\"backdrop_path\":\"/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg\",\"genre_ids\":[18,878],\"id\":157336,\"original_language\":\"en\",\"original_title\":\"Interstellar\",\"overview\":\"Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.\",\"release_date\":\"2014-11-05\",\"poster_path\":\"/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg\",\"popularity\":20.225583,\"title\":\"Interstellar\",\"video\":false,\"vote_average\":8.4,\"vote_count\":2388},{\"adult\":false,\"backdrop_path\":\"/2BXd0t9JdVqCp9sKf6kzMkr7QjB.jpg\",\"genre_ids\":[12,10751,16,28,35],\"id\":177572,\"original_language\":\"en\",\"original_title\":\"Big Hero 6\",\"overview\":\"The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.\",\"release_date\":\"2014-11-07\",\"poster_path\":\"/3zQvuSAUdC3mrx9vnSEpkFX0968.jpg\",\"popularity\":18.418257,\"title\":\"Big Hero 6\",\"video\":false,\"vote_average\":8.0,\"vote_count\":1377},{\"adult\":false,\"backdrop_path\":\"/pfyWJUxrBTT2UIPoEQF3iFTHcQT.jpg\",\"genre_ids\":[28,12,35,80],\"id\":207703,\"original_language\":\"en\",\"original_title\":\"Kingsman: The Secret Service\",\"overview\":\"Kingsman: The Secret Service tells the story of a super-secret spy organization that recruits an unrefined but promising street kid into the agency's ultra-competitive training program just as a global threat emerges from a twisted tech genius.\",\"release_date\":\"2014-12-13\",\"poster_path\":\"/8x7ej0LnHdKUqilNNJXYOeyB6L9.jpg\",\"popularity\":16.743656,\"title\":\"Kingsman: The Secret Service\",\"video\":false,\"vote_average\":7.7,\"vote_count\":907},{\"adult\":false,\"backdrop_path\":\"/qhH3GyIfAnGv1pjdV3mw03qAilg.jpg\",\"genre_ids\":[12,14],\"id\":122917,\"original_language\":\"en\",\"original_title\":\"The Hobbit: The Battle of the Five Armies\",\"overview\":\"Mere seconds after the events of \\\"Desolation\\\", Bilbo and Company continue to claim a mountain of treasure that was guarded long ago: But with Gandalf the Grey also facing some formidable foes of his own, the Hobbit is outmatched when the brutal army of orcs led by Azog the Defiler returns. But with other armies such as the elves and the men of Lake-Town, which are unsure to be trusted, are put to the ultimate test when Smaug's wrath, Azog's sheer strength, and Sauron's force of complete ends attack. All in all, the trusted armies have two choices: unite or die. But even worse, Bilbo gets put on a knife edge and finds himself fighting with Hobbit warfare with all of his might for his dwarf-friends, as the hope for Middle-Earth is all put in Bilbo's hands. The one \\\"precious\\\" thing to end it all.\",\"release_date\":\"2014-12-17\",\"poster_path\":\"/qrFwjJ5nvFnpBCmXLI4YoeHJNBH.jpg\",\"popularity\":17.709831,\"title\":\"The Hobbit: The Battle of the Five Armies\",\"video\":false,\"vote_average\":7.2,\"vote_count\":1426},{\"adult\":false,\"backdrop_path\":\"/cUfGqafAVQkatQ7N4y08RNV3bgu.jpg\",\"genre_ids\":[28,18,53],\"id\":254128,\"original_language\":\"en\",\"original_title\":\"San Andreas\",\"overview\":\"In the aftermath of a massive earthquake in California, a rescue-chopper pilot makes a dangerous journey across the state in order to rescue his estranged daughter.\",\"release_date\":\"2015-05-29\",\"poster_path\":\"/6iQ4CMtYorKFfAmXEpAQZMnA0Qe.jpg\",\"popularity\":17.113429,\"title\":\"San Andreas\",\"video\":false,\"vote_average\":6.3,\"vote_count\":116},{\"adult\":false,\"backdrop_path\":\"/hctIo3ugW79kzV6F9d6A1sMIAyP.jpg\",\"genre_ids\":[36,18,53,10752],\"id\":205596,\"original_language\":\"en\",\"original_title\":\"The Imitation Game\",\"overview\":\"Based on the real life story of legendary cryptanalyst Alan Turing, the film portrays the nail-biting race against time by Turing and his brilliant team of code-breakers at Britain's top-secret Government Code and Cypher School at Bletchley Park, during the darkest days of World War II.\",\"release_date\":\"2014-11-14\",\"poster_path\":\"/noUp0XOqIcmgefRnRZa1nhtRvWO.jpg\",\"popularity\":16.15009,\"title\":\"The Imitation Game\",\"video\":false,\"vote_average\":8.1,\"vote_count\":1167},{\"adult\":false,\"backdrop_path\":\"/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg\",\"genre_ids\":[878,14,12],\"id\":118340,\"original_language\":\"en\",\"original_title\":\"Guardians of the Galaxy\",\"overview\":\"Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.\",\"release_date\":\"2014-08-01\",\"poster_path\":\"/9gm3lL8JMTTmc3W4BmNMCuRLdL8.jpg\",\"popularity\":16.061416,\"title\":\"Guardians of the Galaxy\",\"video\":false,\"vote_average\":8.2,\"vote_count\":2627},{\"adult\":false,\"backdrop_path\":\"/razvUuLkF7CX4XsLyj02ksC0ayy.jpg\",\"genre_ids\":[80,28,53],\"id\":260346,\"original_language\":\"en\",\"original_title\":\"Taken 3\",\"overview\":\"Ex-government operative Bryan Mills finds his life is shattered when he's falsely accused of a murder that hits close to home. As he's pursued by a savvy police inspector, Mills employs his particular set of skills to track the real killer and exact his unique brand of justice.\",\"release_date\":\"2014-12-16\",\"poster_path\":\"/c2SSjUVYawDUnQ92bmTqsZsPEiB.jpg\",\"popularity\":15.493385,\"title\":\"Taken 3\",\"video\":false,\"vote_average\":6.2,\"vote_count\":661},{\"adult\":false,\"backdrop_path\":\"/mFb0ygcue4ITixDkdr7wm1Tdarx.jpg\",\"genre_ids\":[28,53],\"id\":245891,\"original_language\":\"en\",\"original_title\":\"John Wick\",\"overview\":\"After the sudden death of his beloved wife, John Wick receives one last gift from her, a beagle puppy named Daisy, and a note imploring him not to forget how to love. But John's mourning is interrupted when his 1969 Boss Mustang catches the eye of sadistic thug Iosef Tarasov who breaks into his house and steals it, beating John unconscious in the process. Unwittingly, he has just reawakened one of the most brutal assassins the underworld has ever known.\",\"release_date\":\"2014-10-24\",\"poster_path\":\"/sq2MmFv9sanl9PFMfbdaBLveSJ8.jpg\",\"popularity\":15.01665,\"title\":\"John Wick\",\"video\":false,\"vote_average\":7.1,\"vote_count\":904},{\"adult\":false,\"backdrop_path\":\"/hOOgtrByGgWfqGTTn5VL7jkLYXJ.jpg\",\"genre_ids\":[12,18,28],\"id\":147441,\"original_language\":\"en\",\"original_title\":\"Exodus: Gods and Kings\",\"overview\":\"The defiant leader Moses rises up against the Egyptian Pharaoh Ramses, setting 600,000 slaves on a monumental journey of escape from Egypt and its terrifying cycle of deadly plagues.\",\"release_date\":\"2014-12-12\",\"poster_path\":\"/gzOIHvB0kWewC3fo91DNvxDOEAU.jpg\",\"popularity\":14.30129,\"title\":\"Exodus: Gods and Kings\",\"video\":false,\"vote_average\":5.7,\"vote_count\":588},{\"adult\":false,\"backdrop_path\":\"/pKawqrtCBMmxarft7o1LbEynys7.jpg\",\"genre_ids\":[10752,18,28],\"id\":228150,\"original_language\":\"en\",\"original_title\":\"Fury\",\"overview\":\"Last months of World War II in April 1945. As the Allies make their final push in the European Theater, a battle-hardened U.S. Army sergeant in the 2nd Armored Division named Wardaddy commands a Sherman tank called \\\"Fury\\\" and its five-man crew on a deadly mission behind enemy lines. Outnumbered and outgunned, Wardaddy and his men face overwhelming odds in their heroic attempts to strike at the heart of Nazi Germany.\",\"release_date\":\"2014-10-17\",\"poster_path\":\"/il9XWx5CbNd2KdDUwrcClEZiLkv.jpg\",\"popularity\":14.044331,\"title\":\"Fury\",\"video\":false,\"vote_average\":7.4,\"vote_count\":1043},{\"adult\":false,\"backdrop_path\":\"/6bbZ6XyvgfjhQwbplnUh1LSj1ky.jpg\",\"genre_ids\":[18],\"id\":244786,\"original_language\":\"en\",\"original_title\":\"Whiplash\",\"overview\":\"Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.\",\"release_date\":\"2014-10-10\",\"poster_path\":\"/lIv1QinFqz4dlp5U4lQ6HaiskOZ.jpg\",\"popularity\":13.861632,\"title\":\"Whiplash\",\"video\":false,\"vote_average\":8.6,\"vote_count\":808},{\"adult\":false,\"backdrop_path\":\"/fUn5I5f4069vwGFEEvA3HXt9xPP.jpg\",\"genre_ids\":[878,12,53],\"id\":131631,\"original_language\":\"en\",\"original_title\":\"The Hunger Games: Mockingjay - Part 1\",\"overview\":\"Katniss Everdeen reluctantly becomes the symbol of a mass rebellion against the autocratic Capitol.\",\"release_date\":\"2014-11-20\",\"poster_path\":\"/gj282Pniaa78ZJfbaixyLXnXEDI.jpg\",\"popularity\":13.777031,\"title\":\"The Hunger Games: Mockingjay - Part 1\",\"video\":false,\"vote_average\":7.0,\"vote_count\":1334},{\"adult\":false,\"backdrop_path\":\"/c1OSRvorPXvGtFka7mgV6Jcw6jd.jpg\",\"genre_ids\":[28,12,80,10749,53],\"id\":168259,\"original_language\":\"en\",\"original_title\":\"Furious 7\",\"overview\":\"Dominic and his crew thought they left the criminal mercenary life behind. They defeated an international terrorist named Owen Shaw and went their seperate ways. But now, Shaw's brother, Deckard Shaw is out killing the crew one by one for revenge. Worse, a Somalian terrorist called Jakarde, and a shady government official called \\\"Mr. Nobody\\\" are both competing to steal a computer terrorism program called God's Eye, that can turn any technological device into a weapon. Torretto must reconvene with his team to stop Shaw and retrieve the God's Eye program while caught in a power struggle between terrorist and the United States government\",\"release_date\":\"2015-04-03\",\"poster_path\":\"/dCgm7efXDmiABSdWDHBDBx2jwmn.jpg\",\"popularity\":13.630175,\"title\":\"Furious 7\",\"video\":false,\"vote_average\":7.6,\"vote_count\":828}],\"total_pages\":11258,\"total_results\":225147}";

        String seasonTest = "{\"air_date\":\"2008-01-19\",\"episodes\":[{\"air_date\":\"2008-01-19\",\"crew\":[{\"id\":66633,\"credit_id\":\"52542275760ee313280006ce\",\"name\":\"Vince Gilligan\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":66633,\"credit_id\":\"52542275760ee313280006e8\",\"name\":\"Vince Gilligan\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":2483,\"credit_id\":\"52b7029219c29533d00dd2c1\",\"name\":\"John Toll\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280071,\"credit_id\":\"52b702ea19c2955402183a66\",\"name\":\"Lynne Willingham\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":1,\"guest_stars\":[{\"id\":92495,\"name\":\"John Koyama\",\"credit_id\":\"52542273760ee3132800068e\",\"character\":\"Emilio Koyama\",\"order\":1,\"profile_path\":\"/uh4g85qbQGZZ0HH6IQI9fM9VUGS.jpg\"},{\"id\":1223192,\"name\":\"Roberta Marquez Seret\",\"credit_id\":\"52542275760ee313280006a2\",\"character\":\"Chad's Girlfriend\",\"order\":2,\"profile_path\":null},{\"id\":1216132,\"name\":\"Aaron Hill\",\"credit_id\":\"52542275760ee313280006b4\",\"character\":\"Jock\",\"order\":3,\"profile_path\":\"/vTqz2FIutFJPG73j7gFDTWomTbb.jpg\"},{\"id\":161591,\"name\":\"Gregory Chase\",\"credit_id\":\"52725cb1760ee3044d0b9984\",\"character\":\"Dr. Belknap (as Greg Chase)\",\"order\":33,\"profile_path\":null},{\"id\":1046460,\"name\":\"Max Arciniega\",\"credit_id\":\"52725845760ee3046b09426e\",\"character\":\"Krazy-8\",\"order\":38,\"profile_path\":\"/hRyw2cglnWU42vHZUag7b9dIf4u.jpg\"},{\"id\":1223197,\"name\":\"Marius Stan\",\"credit_id\":\"5272587a760ee3045009ddec\",\"character\":\"Bogdan Wolynetz\",\"order\":112,\"profile_path\":null},{\"id\":61535,\"name\":\"Steven Michael Quezada\",\"credit_id\":\"5271b489760ee35b3e0881a7\",\"character\":\"Steven Gomez\",\"order\":173,\"profile_path\":\"/dRJsuGKUWlAooFnYEq85SN9C4Nf.jpg\"},{\"id\":115688,\"name\":\"Carmen Serano\",\"credit_id\":\"52542273760ee31328000676\",\"character\":\"Carmen Molina\",\"order\":176,\"profile_path\":\"/gJOeg4jtRZR5xRBizYX2IibByVj.jpg\"}],\"name\":\"Pilot\",\"overview\":\"When an unassuming high school chemistry teacher discovers he has a rare form of lung cancer, he decides to team up with a former student and create a top of the line crystal meth in a used RV, to provide for his family once he is gone.\",\"id\":62085,\"production_code\":null,\"season_number\":1,\"still_path\":\"/88Z0fMP8a88EpQWMCs1593G0ngu.jpg\",\"vote_average\":8.03571428571429,\"vote_count\":14},{\"air_date\":\"2008-01-26\",\"crew\":[{\"id\":66633,\"credit_id\":\"52542275760ee313280006ce\",\"name\":\"Vince Gilligan\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":111338,\"credit_id\":\"52542275760ee31328000725\",\"name\":\"Adam Bernstein\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/h5TqewYvopqv2AeZytYcrMSupqu.jpg\"},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280071,\"credit_id\":\"52b702ea19c2955402183a66\",\"name\":\"Lynne Willingham\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":2,\"guest_stars\":[{\"id\":92495,\"name\":\"John Koyama\",\"credit_id\":\"52542273760ee3132800068e\",\"character\":\"Emilio Koyama\",\"order\":1,\"profile_path\":\"/uh4g85qbQGZZ0HH6IQI9fM9VUGS.jpg\"},{\"id\":1046460,\"name\":\"Max Arciniega\",\"credit_id\":\"52725845760ee3046b09426e\",\"character\":\"Krazy-8\",\"order\":38,\"profile_path\":\"/hRyw2cglnWU42vHZUag7b9dIf4u.jpg\"}],\"name\":\"The Cat's in the Bag\",\"overview\":\"Walt and Jesse attempt to tie up loose ends. The desperate situation gets more complicated with the flip of a coin. Walt's wife, Skyler, becomes suspicious of Walt's strange behavior.\",\"id\":62086,\"production_code\":null,\"season_number\":1,\"still_path\":\"/2v0kPL1ARB9YCegUmT57cjT1KPm.jpg\",\"vote_average\":9.0,\"vote_count\":1},{\"air_date\":\"2008-02-09\",\"crew\":[{\"id\":66633,\"credit_id\":\"52542275760ee313280006ce\",\"name\":\"Vince Gilligan\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":111338,\"credit_id\":\"52542275760ee31328000725\",\"name\":\"Adam Bernstein\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/h5TqewYvopqv2AeZytYcrMSupqu.jpg\"},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280074,\"credit_id\":\"52b7051619c29533d00e8c79\",\"name\":\"Kelley Dixon\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":3,\"guest_stars\":[{\"id\":1046460,\"name\":\"Max Arciniega\",\"credit_id\":\"52725845760ee3046b09426e\",\"character\":\"Krazy-8\",\"order\":38,\"profile_path\":\"/hRyw2cglnWU42vHZUag7b9dIf4u.jpg\"},{\"id\":61535,\"name\":\"Steven Michael Quezada\",\"credit_id\":\"5271b489760ee35b3e0881a7\",\"character\":\"Steven Gomez\",\"order\":173,\"profile_path\":\"/dRJsuGKUWlAooFnYEq85SN9C4Nf.jpg\"},{\"id\":115688,\"name\":\"Carmen Serano\",\"credit_id\":\"52542273760ee31328000676\",\"character\":\"Carmen Molina\",\"order\":176,\"profile_path\":\"/gJOeg4jtRZR5xRBizYX2IibByVj.jpg\"},{\"id\":14984,\"name\":\"Jessica Hecht\",\"credit_id\":\"52542275760ee31328000768\",\"character\":\"Gretchen Schwartz\",\"order\":182,\"profile_path\":\"/jT5k2BLOEXaRF94ZV9plQBV6mAL.jpg\"}],\"name\":\"...and the Bag's in the River\",\"overview\":\"Walter fights with Jesse over his drug use, causing him to leave Walter alone with their captive, Krazy-8. Meanwhile, Hank has a scared straight moment with Walter Jr. after his aunt discovers he has been smoking pot. Also, Skylar is upset when Walter stays away from home.\",\"id\":62087,\"production_code\":null,\"season_number\":1,\"still_path\":\"/mn73tWx7ivuMmdBdiHFK7KRHjDy.jpg\",\"vote_average\":0.0,\"vote_count\":0},{\"air_date\":\"2008-02-16\",\"crew\":[{\"id\":66633,\"credit_id\":\"52542275760ee313280006ce\",\"name\":\"Vince Gilligan\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":205639,\"credit_id\":\"52542278760ee31328000a9b\",\"name\":\"Jim McKay\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/tpfgY0AanfoxgFQpmZ6qz1QRJpv.jpg\"},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280071,\"credit_id\":\"52b702ea19c2955402183a66\",\"name\":\"Lynne Willingham\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":4,\"guest_stars\":[{\"id\":1215836,\"name\":\"Kyle Bornheimer\",\"credit_id\":\"52743e4d760ee35a69055194\",\"character\":\"Ken Wins\",\"order\":37,\"profile_path\":\"/ucMZNXfcG8NlVIPBGujt15fFPcX.jpg\"},{\"id\":220118,\"name\":\"Benjamin Petry\",\"credit_id\":\"527442eb760ee3572b078715\",\"character\":\"Jake Pinkman (as Ben Petry)\",\"order\":40,\"profile_path\":\"/s0CaWbrxL9bhuiQ4F1XN6dWNPaW.jpg\"},{\"id\":79211,\"name\":\"David House\",\"credit_id\":\"5271b65b760ee35b0c090f74\",\"character\":\"Dr. Delcavoli\",\"order\":71,\"profile_path\":null},{\"id\":41249,\"name\":\"Tess Harper\",\"credit_id\":\"52542277760ee31328000a61\",\"character\":\"Mrs. Pinkman\",\"order\":75,\"profile_path\":\"/gJT9fBX04LjmbOzOzYcNbA2ZLF1.jpg\"},{\"id\":95195,\"name\":\"Michael Bofshever\",\"credit_id\":\"527440ce760ee3570906ada3\",\"character\":\"Mr. Pinkman\",\"order\":75,\"profile_path\":\"/wd4CATP5RQTq5iAyTJEC74qkStV.jpg\"},{\"id\":61535,\"name\":\"Steven Michael Quezada\",\"credit_id\":\"5271b489760ee35b3e0881a7\",\"character\":\"Steven Gomez\",\"order\":173,\"profile_path\":\"/dRJsuGKUWlAooFnYEq85SN9C4Nf.jpg\"},{\"id\":82945,\"name\":\"Charles Baker\",\"credit_id\":\"52744007760ee356f6076365\",\"character\":\"Skinny Pete\",\"order\":182,\"profile_path\":\"/lZ5fOVbTVvHkpSX9PUXNfkYLPUt.jpg\"}],\"name\":\"Cancer Man\",\"overview\":\"Walter finally tells his family that he has been stricken with cancer. Meanwhile, the DEA believes Albuquerque has a new, big time player to worry about. Meanwhile, a worthy recipient is the target of a depressed Walter's anger, and Jesse makes a surprise visit to his parents home.\",\"id\":62088,\"production_code\":null,\"season_number\":1,\"still_path\":\"/m1CCrmD47ag6r8zQCDpd54ryksw.jpg\",\"vote_average\":0.0,\"vote_count\":0},{\"air_date\":\"2008-02-23\",\"crew\":[{\"id\":1218856,\"credit_id\":\"52542278760ee31328000aea\",\"name\":\"Patty Lin\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":null},{\"id\":1215145,\"credit_id\":\"52542278760ee31328000afe\",\"name\":\"Tricia Brock\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":null},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280074,\"credit_id\":\"52b7051619c29533d00e8c79\",\"name\":\"Kelley Dixon\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":5,\"guest_stars\":[{\"id\":202830,\"name\":\"William Sterchi\",\"credit_id\":\"527445a9760ee356ff077e53\",\"character\":\"Manager\",\"order\":43,\"profile_path\":null},{\"id\":59303,\"name\":\"Marc Mouchet\",\"credit_id\":\"527445f5760ee357130849b9\",\"character\":\"Farley\",\"order\":44,\"profile_path\":null},{\"id\":209680,\"name\":\"Frederic Doss\",\"credit_id\":\"54e89b13c3a36836e0001dc9\",\"character\":\"Off Duty Cop\",\"order\":180,\"profile_path\":null},{\"id\":14984,\"name\":\"Jessica Hecht\",\"credit_id\":\"52542275760ee31328000768\",\"character\":\"Gretchen Schwartz\",\"order\":182,\"profile_path\":\"/jT5k2BLOEXaRF94ZV9plQBV6mAL.jpg\"},{\"id\":191202,\"name\":\"Matt Jones\",\"credit_id\":\"52744535760ee3572209100e\",\"character\":\"Badger\",\"order\":182,\"profile_path\":\"/wcB788lpiyc58s0F3nzqZnspISA.jpg\"},{\"id\":23429,\"name\":\"Adam Godley\",\"credit_id\":\"527444c1760ee3572208fbc2\",\"character\":\"Elliott Schwartz\",\"order\":182,\"profile_path\":\"/bpS9H0TYn67BMGBNv32180j8LX7.jpg\"}],\"name\":\"Gray Matter\",\"overview\":\"Walter and Skyler attend a former colleague's party. Jesse tries to free himself from the drugs, while Skyler organizes an intervention.\",\"id\":62089,\"production_code\":null,\"season_number\":1,\"still_path\":\"/aR1BLarVxcMSemL6Q0C796nZfC2.jpg\",\"vote_average\":0.0,\"vote_count\":0},{\"air_date\":\"2008-03-01\",\"crew\":[{\"id\":1223193,\"credit_id\":\"52542279760ee31328000b45\",\"name\":\"George Mastras\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":null},{\"id\":18320,\"credit_id\":\"52542279760ee31328000b61\",\"name\":\"Bronwen Hughes\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/eOCUyOpDGsliiWA3c5qc2CGS5he.jpg\"},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1123195,\"credit_id\":\"52b705e619c2955a1f0c895b\",\"name\":\"Skip MacDonald\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":6,\"guest_stars\":[{\"id\":58650,\"name\":\"Raymond Cruz\",\"credit_id\":\"5254227b760ee31328000cd6\",\"character\":\"Tuco Salamanca\",\"order\":44,\"profile_path\":\"/4k0r3xJjgTac5GiJoHDDBVAFYcj.jpg\"},{\"id\":210056,\"name\":\"Pierre Barrera\",\"credit_id\":\"52744776760ee356ea0892f3\",\"character\":\"Hugo Archuleta\",\"order\":44,\"profile_path\":null},{\"id\":187505,\"name\":\"Vivian Nesbitt\",\"credit_id\":\"527447f4760ee37c3e00f81f\",\"character\":\"Mrs. Pope\",\"order\":47,\"profile_path\":null},{\"id\":1089016,\"name\":\"Seri DeYoung\",\"credit_id\":\"52744908760ee35a690730ed\",\"character\":\"Student (as Seraphine DeYoung)\",\"order\":49,\"profile_path\":\"/72e1Ka1679fEKNxpYlshJXJhoXh.jpg\"},{\"id\":1221121,\"name\":\"Dennis Keiffer\",\"credit_id\":\"52744a4a760ee35a69077c8c\",\"character\":\"Lookout\",\"order\":50,\"profile_path\":null},{\"id\":53255,\"name\":\"Cesar Garcia\",\"credit_id\":\"527447ca760ee356ea08e165\",\"character\":\"Gonzo\",\"order\":52,\"profile_path\":\"/6KkknahgOIBaZfz3ip3UV89iVFO.jpg\"},{\"id\":1260529,\"name\":\"Jesus Jr.\",\"credit_id\":\"527447b3760ee3571308a638\",\"character\":\"No-Doze (as Jesus Payan)\",\"order\":52,\"profile_path\":null},{\"id\":210057,\"name\":\"Judith Rane\",\"credit_id\":\"52744834760ee37c3e010cc7\",\"character\":\"Office Manager\",\"order\":61,\"profile_path\":null},{\"id\":61535,\"name\":\"Steven Michael Quezada\",\"credit_id\":\"5271b489760ee35b3e0881a7\",\"character\":\"Steven Gomez\",\"order\":173,\"profile_path\":\"/dRJsuGKUWlAooFnYEq85SN9C4Nf.jpg\"},{\"id\":115688,\"name\":\"Carmen Serano\",\"credit_id\":\"52542273760ee31328000676\",\"character\":\"Carmen Molina\",\"order\":176,\"profile_path\":\"/gJOeg4jtRZR5xRBizYX2IibByVj.jpg\"},{\"id\":82945,\"name\":\"Charles Baker\",\"credit_id\":\"52744007760ee356f6076365\",\"character\":\"Skinny Pete\",\"order\":182,\"profile_path\":\"/lZ5fOVbTVvHkpSX9PUXNfkYLPUt.jpg\"}],\"name\":\"Crazy Handful of Nothin'\",\"overview\":\"The side effects of chemo begin to plague Walt. Meanwhile, the DEA rounds up suspected dealers.\",\"id\":62090,\"production_code\":null,\"season_number\":1,\"still_path\":\"/fZST9WpwrYl2qHq3WHdUFDrPc2U.jpg\",\"vote_average\":0.0,\"vote_count\":0},{\"air_date\":\"2008-03-08\",\"crew\":[{\"id\":24951,\"credit_id\":\"52542286760ee31328001ab9\",\"name\":\"Peter Gould\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":null},{\"id\":15858,\"credit_id\":\"5254227b760ee31328000d0c\",\"name\":\"Tim Hunter\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/wEho8OQCrEJx94Q91fvSY203BgI.jpg\"},{\"id\":17948,\"credit_id\":\"52b7049c19c2953b63015013\",\"name\":\"Reynaldo Villalobos\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280071,\"credit_id\":\"52b702ea19c2955402183a66\",\"name\":\"Lynne Willingham\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":7,\"guest_stars\":[{\"id\":58650,\"name\":\"Raymond Cruz\",\"credit_id\":\"5254227b760ee31328000cd6\",\"character\":\"Tuco Salamanca\",\"order\":44,\"profile_path\":\"/4k0r3xJjgTac5GiJoHDDBVAFYcj.jpg\"},{\"id\":967071,\"name\":\"Beth Bailey\",\"credit_id\":\"52744bd7760ee356ff08c286\",\"character\":\"Realtor\",\"order\":50,\"profile_path\":\"/6KuevI6K8VcKJFB6vyuMZ0cPvM7.jpg\"},{\"id\":58651,\"name\":\"Geoffrey Rivas\",\"credit_id\":\"52744c32760ee37c3e01cba4\",\"character\":\"Police Officer\",\"order\":51,\"profile_path\":null},{\"id\":53255,\"name\":\"Cesar Garcia\",\"credit_id\":\"527447ca760ee356ea08e165\",\"character\":\"Gonzo\",\"order\":52,\"profile_path\":\"/6KkknahgOIBaZfz3ip3UV89iVFO.jpg\"},{\"id\":210154,\"name\":\"Mike Miller\",\"credit_id\":\"52744cd0760ee357130a126e\",\"character\":\"Jewelry Store Owner\",\"order\":52,\"profile_path\":null},{\"id\":1260529,\"name\":\"Jesus Jr.\",\"credit_id\":\"527447b3760ee3571308a638\",\"character\":\"No-Doze (as Jesus Payan)\",\"order\":52,\"profile_path\":null},{\"id\":79211,\"name\":\"David House\",\"credit_id\":\"5271b65b760ee35b0c090f74\",\"character\":\"Dr. Delcavoli\",\"order\":71,\"profile_path\":null},{\"id\":115688,\"name\":\"Carmen Serano\",\"credit_id\":\"52542273760ee31328000676\",\"character\":\"Carmen Molina\",\"order\":176,\"profile_path\":\"/gJOeg4jtRZR5xRBizYX2IibByVj.jpg\"}],\"name\":\"A No-Rough-Stuff Type Deal\",\"overview\":\"Walter accepts his new identity as a drug dealer after a PTA meeting. Elsewhere, Jesse decides to put his aunt's house on the market and Skyler is the recipient of a baby shower.\",\"id\":62091,\"production_code\":null,\"season_number\":1,\"still_path\":\"/gyRMAdWZHhWpXpOvA1ctwoIuG4e.jpg\",\"vote_average\":9.5,\"vote_count\":1}],\"name\":\"Season 1\",\"overview\":\"The first season of the American television drama series Breaking Bad premiered on January 20, 2008 and concluded on March 9, 2008. It consisted of seven episodes, each running approximately 47 minutes in length, except the pilot episode which runs approximately 57 minutes. AMC broadcast the first season on Sundays at 10:00 pm in the United States. Season one was to consist of nine episodes, which was reduced to seven by the writer's strike. The complete first season was released on Region 1 DVD on February 24, 2009 and Region A Blu-ray on March 16, 2010.\",\"id\":3572,\"poster_path\":\"/o5131POxv9xFl3wBmdg0YWc9Iz4.jpg\",\"season_number\":1}";

        String episodeTest = "{\"air_date\":\"2008-01-19\",\"crew\":[{\"id\":66633,\"credit_id\":\"52542275760ee313280006ce\",\"name\":\"Vince Gilligan\",\"department\":\"Writing\",\"job\":\"Writer\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":66633,\"credit_id\":\"52542275760ee313280006e8\",\"name\":\"Vince Gilligan\",\"department\":\"Directing\",\"job\":\"Director\",\"profile_path\":\"/rLSUjr725ez1cK7SKVxC9udO03Y.jpg\"},{\"id\":2483,\"credit_id\":\"52b7029219c29533d00dd2c1\",\"name\":\"John Toll\",\"department\":\"Camera\",\"job\":\"Director of Photography\",\"profile_path\":null},{\"id\":1280071,\"credit_id\":\"52b702ea19c2955402183a66\",\"name\":\"Lynne Willingham\",\"department\":\"Editing\",\"job\":\"Editor\",\"profile_path\":null}],\"episode_number\":1,\"guest_stars\":[{\"id\":92495,\"name\":\"John Koyama\",\"credit_id\":\"52542273760ee3132800068e\",\"character\":\"Emilio Koyama\",\"order\":1,\"profile_path\":\"/uh4g85qbQGZZ0HH6IQI9fM9VUGS.jpg\"},{\"id\":1223192,\"name\":\"Roberta Marquez Seret\",\"credit_id\":\"52542275760ee313280006a2\",\"character\":\"Chad's Girlfriend\",\"order\":2,\"profile_path\":null},{\"id\":1216132,\"name\":\"Aaron Hill\",\"credit_id\":\"52542275760ee313280006b4\",\"character\":\"Jock\",\"order\":3,\"profile_path\":\"/vTqz2FIutFJPG73j7gFDTWomTbb.jpg\"},{\"id\":161591,\"name\":\"Gregory Chase\",\"credit_id\":\"52725cb1760ee3044d0b9984\",\"character\":\"Dr. Belknap (as Greg Chase)\",\"order\":33,\"profile_path\":null},{\"id\":1046460,\"name\":\"Max Arciniega\",\"credit_id\":\"52725845760ee3046b09426e\",\"character\":\"Krazy-8\",\"order\":38,\"profile_path\":\"/hRyw2cglnWU42vHZUag7b9dIf4u.jpg\"},{\"id\":1223197,\"name\":\"Marius Stan\",\"credit_id\":\"5272587a760ee3045009ddec\",\"character\":\"Bogdan Wolynetz\",\"order\":112,\"profile_path\":null},{\"id\":61535,\"name\":\"Steven Michael Quezada\",\"credit_id\":\"5271b489760ee35b3e0881a7\",\"character\":\"Steven Gomez\",\"order\":173,\"profile_path\":\"/dRJsuGKUWlAooFnYEq85SN9C4Nf.jpg\"},{\"id\":115688,\"name\":\"Carmen Serano\",\"credit_id\":\"52542273760ee31328000676\",\"character\":\"Carmen Molina\",\"order\":176,\"profile_path\":\"/gJOeg4jtRZR5xRBizYX2IibByVj.jpg\"}],\"name\":\"Pilot\",\"overview\":\"When an unassuming high school chemistry teacher discovers he has a rare form of lung cancer, he decides to team up with a former student and create a top of the line crystal meth in a used RV, to provide for his family once he is gone.\",\"id\":62085,\"production_code\":null,\"season_number\":1,\"still_path\":\"/88Z0fMP8a88EpQWMCs1593G0ngu.jpg\",\"vote_average\":8.03571428571429,\"vote_count\":14}";

        String genreTest = "{\"genres\":[{\"id\":10759,\"name\":\"Action & Adventure\"},{\"id\":16,\"name\":\"Animation\"},{\"id\":35,\"name\":\"Comedy\"},{\"id\":99,\"name\":\"Documentary\"},{\"id\":18,\"name\":\"Drama\"},{\"id\":10751,\"name\":\"Family\"},{\"id\":10762,\"name\":\"Kids\"},{\"id\":9648,\"name\":\"Mystery\"},{\"id\":10763,\"name\":\"News\"},{\"id\":10764,\"name\":\"Reality\"},{\"id\":10765,\"name\":\"Sci-Fi & Fantasy\"},{\"id\":10766,\"name\":\"Soap\"},{\"id\":10767,\"name\":\"Talk\"},{\"id\":10768,\"name\":\"War & Politics\"},{\"id\":37,\"name\":\"Western\"}]}";

        ObjectMapper mapper = new ObjectMapper();
        TMDBSeries tvWrapper = null;
        TMDBMovieWrapper movieWrapper = null;
        TMDBSeason season = null;
        TMDBEpisode episode = null;
        TMDBGenreWrapper genre = null;

        try {
            movieWrapper = mapper.readValue(json2, TMDBMovieWrapper.class);
            tvWrapper = mapper.readValue(json, TMDBSeries.class);
            season = mapper.readValue(seasonTest, TMDBSeason.class);
            episode = mapper.readValue(episodeTest, TMDBEpisode.class);
            genre = mapper.readValue(genreTest, TMDBGenreWrapper.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(tvWrapper);
        System.out.println(movieWrapper);
    }
}
