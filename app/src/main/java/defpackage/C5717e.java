package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5717e implements InterfaceC8418e {
    public final /* synthetic */ int ad;
    public static final C5717e vip = new C5717e(0);
    public static final C5717e metrica = new C5717e(1);
    public static final C5717e license = new C5717e(2);

    public /* synthetic */ C5717e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC8418e
    public final File ad(Context context, String str) {
        switch (this.ad) {
            case 0:
                return AbstractC2745e.metrica(context, str);
            case 1:
                return AbstractC2745e.metrica(context, str);
            default:
                return AbstractC2745e.metrica(context, str);
        }
    }

    @Override // defpackage.InterfaceC8418e
    public final Object vip(Context context, String str) {
        switch (this.ad) {
            case 0:
                return C10990e.startapp(C15136e.f29932e, new C1478e(1, context, str));
            case 1:
                return C10990e.startapp(C0098e.f1258e, new C1478e(2, context, str));
            default:
                return C10990e.startapp(C11047e.f21914e, new C1478e(4, context, str));
        }
    }
}
