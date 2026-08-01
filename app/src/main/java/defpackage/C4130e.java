package defpackage;

import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4130e implements InterfaceC14811e {
    public static final C4130e ad = new Object();

    @Override // defpackage.InterfaceC14811e
    public final void ad(AppActivity appActivity, VKProfile vKProfile, List list) {
        String str;
        long metrica;
        String license;
        String str2;
        String license2;
        C2464e c2464e = C2464e.appmetrica;
        if (vKProfile == null || (str = vKProfile.license) == null) {
            C14027e.ad.getClass();
            C8221e c8221e = VKXApplication.f36536e;
            if (c8221e == null) {
                c8221e = null;
            }
            str = ((C18479e) c8221e.billing).adcel;
        }
        AlbumThumb albumThumb = new AlbumThumb((String) null, (String) null, (String) null, str, (String) null, 23);
        if (vKProfile != null) {
            metrica = vKProfile.ad;
        } else {
            C14027e.ad.getClass();
            metrica = C14027e.metrica();
        }
        long j = metrica;
        if (vKProfile == null || (license = vKProfile.ad()) == null) {
            C14027e.ad.getClass();
            license = C14027e.license();
        }
        String str3 = license;
        StringBuilder sb = new StringBuilder("Автоматически созданный плейлист, представляющий ");
        if (vKProfile != null) {
            str2 = "библиотеку \"" + vKProfile.ad() + '\"';
        } else {
            str2 = "вашу библиотеку. При повторном кешировании список обновится.";
        }
        sb.append(str2);
        AudioPlaylist audioPlaylist = new AudioPlaylist(-1337, j, null, null, str3, sb.toString(), 0, 0, 0, 0L, null, null, null, null, null, 0, null, null, albumThumb, null, null, null, null, null, false, false, null, null, null, null, null, false, null, false, false, -262196, 7);
        if (vKProfile == null || (license2 = vKProfile.ad()) == null) {
            C14027e.ad.getClass();
            license2 = C14027e.license();
        }
        C0389e c0389e = new C0389e(audioPlaylist, list, license2);
        c2464e.getClass();
        C2464e.metrica(appActivity, c0389e);
        C16251e c16251e = C16251e.ad;
        NextDockView nextDockView = (NextDockView) appActivity.f36547e.f10519e;
        String valueOf = String.valueOf(3);
        Iterator it = nextDockView.f36761e.iterator();
        while (it.hasNext()) {
            C0998e c0998e = (C0998e) it.next();
            if (AbstractC7890e.billing(c0998e.ad.ad, valueOf)) {
                c16251e.ad((FrameLayout) c0998e.vip.f23948e, EnumC14893e.f29518e);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C4130e);
    }

    @Override // defpackage.InterfaceC14811e
    public final int getTitle() {
        return R.string.library_mass_action_cache;
    }

    public final int hashCode() {
        return -1763686629;
    }

    public final String toString() {
        return "Cache";
    }
}
