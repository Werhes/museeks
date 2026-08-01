package defpackage;

import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3119e extends AbstractC15638e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final int f7191e = R.string.app_name;

    public C3119e() {
        C1169e license = AbstractC6874e.license();
        license.add(new C1334e(R.string.menu_account));
        C14027e.ad.getClass();
        if (C14027e.ad()) {
            license.add(new C4924e(R.string.orbit_menu_switchto, AbstractC12315e.ad, R.drawable.ic_user_outline_28, new C15101e(0, this, C3119e.class, "switchToVk", "switchToVk()V", 0, 0, 27), 2));
        } else {
            license.add(new C4924e(R.string.orbit_menu_signin, AbstractC12315e.vip, R.drawable.ic_user_outline_28, new C15101e(0, this, C3119e.class, "switchToVkAuth", "switchToVkAuth()V", 0, 0, 28), 2));
        }
        license.add(new C4924e(R.string.orbitmenu_cache, (C2892e) null, R.drawable.ic_download_outline_28, new C15101e(0, this, C3119e.class, "openCachedTracks", "openCachedTracks()V", 0, 0, 29), 6));
        license.add(new C1334e(R.string.acc_prefs));
        m4008strictfp(license, R.string.it_header, 0, R.drawable.ic_palette_outline_28, new C0568e(21));
        m4008strictfp(license, R.string.settings_now_playing_title, R.string.settings_now_playing_desc, R.drawable.ic_sound_wave_outline_28, C6743e.f13941e);
        m4008strictfp(license, R.string.st_pb, R.string.st_pb_desc, R.drawable.ic_video_outline_28, new C0568e(22));
        m4008strictfp(license, R.string.settings_root_experimental, R.string.settings_root_experimental_desc, R.drawable.ic_bug_outline_28, C0540e.f2707e);
        m4008strictfp(license, R.string.nmenu_about, 0, R.drawable.ic_info_outline_28, new C0568e(23));
        m4009transient(AbstractC6874e.metrica(license));
    }

    @Override // defpackage.AbstractC15638e
    /* renamed from: package, reason: not valid java name */
    public final int mo1231package() {
        return this.f7191e;
    }
}
