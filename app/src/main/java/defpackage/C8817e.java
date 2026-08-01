package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8817e implements InterfaceC14811e {
    public static final C8817e ad = new Object();

    @Override // defpackage.InterfaceC14811e
    public final void ad(AppActivity appActivity, VKProfile vKProfile, List list) {
        String license;
        StringBuilder sb = new StringBuilder("Библиотека профиля ");
        if (vKProfile == null || (license = vKProfile.ad()) == null) {
            C14027e.ad.getClass();
            license = C14027e.license();
        }
        sb.append(license);
        AbstractC2745e.vip(appActivity, new C1708e(sb.toString(), list, 5));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8817e);
    }

    @Override // defpackage.InterfaceC14811e
    public final int getTitle() {
        return R.string.library_mass_action_download;
    }

    public final int hashCode() {
        return 207969871;
    }

    public final String toString() {
        return "Download";
    }
}
