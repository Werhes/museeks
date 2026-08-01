package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15361e implements InterfaceC7273e {
    public final C12817e ad;
    public final C6302e vip;

    public C15361e(C12817e c12817e, C6302e c6302e) {
        this.ad = c12817e;
        this.vip = c6302e;
    }

    @Override // defpackage.InterfaceC7273e
    public final Object ad(C0739e c0739e) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        ContentResolver contentResolver = vKXApplication.getContentResolver();
        C12817e c12817e = this.ad;
        InputStream openInputStream = contentResolver.openInputStream(Uri.parse(c12817e.getLicense()));
        if (openInputStream != null) {
            C7769e metrica = AbstractC0436e.metrica(new C13197e(AbstractC8636e.appmetrica(openInputStream)), this.vip.purchase);
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            return new C16569e(metrica, (vKXApplication2 != null ? vKXApplication2 : null).getContentResolver().getType(Uri.parse(c12817e.getLicense())), 3);
        }
        throw new IllegalStateException(("[sdkload] failed resolving cover for " + String.valueOf(c12817e.ad)).toString());
    }
}
