package defpackage;

import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5299e extends AbstractC15638e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ int f11385e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final int f11386e;

    public C5299e(int i) {
        this.f11385e = i;
        switch (i) {
            case 1:
                this.f11386e = R.string.nmenu_catalogs;
                C1169e license = AbstractC6874e.license();
                m4008strictfp(license, R.string.menu_history, R.string.menu_history_desc, R.drawable.history_backward_outline_28, new C14582e(26));
                m4008strictfp(license, R.string.ctg_updates, 0, R.drawable.ic_archive_outline_28, new C14582e(27));
                m4008strictfp(license, R.string.ctg_friends, 0, R.drawable.ic_user_outline_28, new C14582e(28));
                m4008strictfp(license, R.string.ctg_groups, 0, R.drawable.ic_users_outline_28, new C14582e(29));
                m4008strictfp(license, R.string.radiostations, R.string.radiostations_desc, R.drawable.ic_radiowaves_left_and_right_outline_28, new C13630e(0));
                m4009transient(AbstractC6874e.metrica(license));
                return;
            case 2:
                this.f11386e = R.string.acc_prefs;
                C1169e license2 = AbstractC6874e.license();
                m4008strictfp(license2, R.string.it_header, 0, R.drawable.ic_palette_outline_28, C8151e.f16548e);
                m4008strictfp(license2, R.string.settings_now_playing_title, R.string.settings_now_playing_desc, R.drawable.ic_sound_wave_outline_28, C10884e.f21559e);
                m4008strictfp(license2, R.string.st_pb, R.string.st_pb_desc, R.drawable.ic_video_outline_28, C8349e.f17079e);
                m4008strictfp(license2, R.string.st_not, R.string.st_not_desc, R.drawable.ic_notifications_28, C14968e.f29685e);
                m4008strictfp(license2, R.string.pref_category_thirdparty, R.string.pref_category_thirdparty_desc, R.drawable.ic_services_outline_28, C17436e.f34151e);
                m4008strictfp(license2, R.string.st_storage, R.string.st_storage_desc, R.drawable.ic_download_outline_28, C1290e.f4003e);
                m4008strictfp(license2, R.string.settings_root_experimental, R.string.settings_root_experimental_desc, R.drawable.ic_bug_outline_28, C0950e.f3377e);
                m4008strictfp(license2, R.string.st_proxy, R.string.st_proxy_desc, R.drawable.ic_globe_outline_28, C14222e.f28095e);
                m4008strictfp(license2, R.string.ota_pref, 0, R.drawable.ic_upload_outline_28, C16173e.f31780e);
                m4009transient(AbstractC6874e.metrica(license2));
                return;
            case 3:
                this.f11386e = R.string.nmenu_profiles;
                C1169e license3 = AbstractC6874e.license();
                m4008strictfp(license3, R.string.acc_friends, 0, R.drawable.ic_user_outline_28, new C11689e(11));
                m4008strictfp(license3, R.string.acc_groups, 0, R.drawable.ic_users_outline_28, new C11689e(12));
                m4008strictfp(license3, R.string.acc_wall, 0, R.drawable.ic_article_outline_28, new C11689e(13));
                m4008strictfp(license3, R.string.acc_news, R.string.acc_news_desc, R.drawable.ic_newsfeed_outline_28, new C11689e(14));
                m4008strictfp(license3, R.string.messages_shared_media, R.string.messages_shared_media_desc, R.drawable.ic_message_outline_28, new C11689e(15));
                m4009transient(AbstractC6874e.metrica(license3));
                return;
            case 4:
                this.f11386e = R.string.rec_screen;
                C1169e license4 = AbstractC6874e.license();
                m4008strictfp(license4, R.string.tab_recommendations, R.string.acc_rec_desc, R.drawable.ic_advertising_outline_28, new C11689e(23));
                m4008strictfp(license4, R.string.ctg_artists, 0, R.drawable.ic_music_mic_outline_28, new C11689e(24));
                m4008strictfp(license4, R.string.rec_screen_for_you, R.string.rec_screen_for_you_desc, R.drawable.ic_playlist_outline_28, new C11689e(25));
                license4.add(C5047e.ad);
                license4.add(new C1334e(R.string.rec_screen_genres));
                license4.add(new Object());
                m4008strictfp(license4, R.string.tab_popular, R.string.acc_pop_desc, R.drawable.ic_statistics_outline_28, new C11689e(26));
                int i2 = 13;
                for (C6571e c6571e : AbstractC6874e.startapp(new C6571e(1, "Rock"), new C6571e(2, "Pop"), new C6571e(3, "Rap & Hip-Hop"), new C6571e(4, "Easy Listening"), new C6571e(5, "House & Dance"), new C6571e(6, "Instrumental"), new C6571e(7, "Metal"), new C6571e(21, "Alternative"), new C6571e(8, "Dubstep"), new C6571e(1001, "Jazz & Blues"), new C6571e(10, "Drum & Bass"), new C6571e(11, "Trance"), new C6571e(13, "Ethnic"), new C6571e(14, "Acoustic & Vocal"), new C6571e(15, "Reggae"), new C6571e(16, "Classical"), new C6571e(17, "Indie Pop"), new C6571e(22, "Electropop & Disco"), new C6571e(18, "Other"))) {
                    int intValue = ((Number) c6571e.f13544e).intValue();
                    String str = (String) c6571e.f13543e;
                    license4.add(new C4924e(0, new C2892e(-1914691139, true, new C11449e(str, 18)), (Function2) null, 0, new C5565e(this, new C8779e(intValue, str, 5), i2)));
                    i2 = 13;
                }
                m4009transient(AbstractC6874e.metrica(license4));
                return;
            default:
                this.f11386e = R.string.account_category;
                C1169e license5 = AbstractC6874e.license();
                license5.add(new C4924e(R.string.auth2_qr_code_scanner_act, new C2892e(1326809315, true, new C14151e((byte) 0, 4)), R.drawable.ic_qr_code_outline_28, new C14515e(1, this), 2));
                m4008strictfp(license5, R.string.privacy_cfg, R.string.privacy_cfg_desc, R.drawable.ic_user_outline_28, C9269e.f18484e);
                m4008strictfp(license5, R.string.blacklist_menu, R.string.blacklist_menu_desc, R.drawable.ic_block_outline_28, C4299e.f9400e);
                m4007private(license5, R.string.catalog_blacklist, R.string.catalog_blacklist_text, R.drawable.ic_edit_outline_28, C10065e.f19877e);
                m4007private(license5, R.string.find_duplicates, R.string.find_duplicates_text, R.drawable.ic_search_outline_28, C17154e.f33647e);
                m4007private(license5, R.string.libtools_wipe_library, R.string.libtools_wipe_library_text, R.drawable.ic_delete_outline_28, C3461e.f7714e);
                m4007private(license5, R.string.android_auto_entrypoint, 0, R.drawable.ic_car_outline_28, C12463e.f24949e);
                m4009transient(AbstractC6874e.metrica(license5));
                return;
        }
    }

    @Override // defpackage.AbstractC15638e
    /* renamed from: package */
    public final int mo1231package() {
        switch (this.f11385e) {
            case 0:
                return this.f11386e;
            case 1:
                return this.f11386e;
            case 2:
                return this.f11386e;
            case 3:
                return this.f11386e;
            default:
                return this.f11386e;
        }
    }
}
