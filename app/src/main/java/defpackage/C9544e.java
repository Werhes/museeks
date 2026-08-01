package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9544e implements InterfaceC11094e {
    public static final C9544e vip = new C9544e(0);
    public final /* synthetic */ int ad;

    public /* synthetic */ C9544e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC11094e
    public final InterfaceC7273e ad(Object obj, C6302e c6302e, C0624e c0624e) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.ad) {
            case 0:
                return new C15361e((C12817e) obj, c6302e);
            case 1:
                C0388e c0388e = (C0388e) obj;
                Bitmap.Config[] configArr = AbstractC13427e.ad;
                if (AbstractC7890e.billing(c0388e.metrica, "file") && AbstractC7890e.billing(AbstractC13480e.m3604this(AbstractC0718e.yandex(c0388e)), "android_asset")) {
                    return new C3692e(c0388e, c6302e, i);
                }
                return null;
            case 2:
                return new C11562e((Bitmap) obj);
            case 3:
                return new C6402e((byte[]) obj, c6302e, i);
            case 4:
                return new C6402e((ByteBuffer) obj, c6302e, i2);
            case 5:
                C0388e c0388e2 = (C0388e) obj;
                if (AbstractC7890e.billing(c0388e2.metrica, "content")) {
                    return new C13028e(c0388e2, c6302e);
                }
                return null;
            case 6:
                C0388e c0388e3 = (C0388e) obj;
                if (AbstractC7890e.billing(c0388e3.metrica, "data")) {
                    return new C3692e(c0388e3, c6302e, i2);
                }
                return null;
            case 7:
                return new C6402e((Drawable) obj, c6302e, i3);
            case 8:
                C0388e c0388e4 = (C0388e) obj;
                String str = c0388e4.metrica;
                if ((str != null && !str.equals("file")) || c0388e4.appmetrica == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC13427e.ad;
                if (AbstractC7890e.billing(c0388e4.metrica, "file") && AbstractC7890e.billing(AbstractC13480e.m3604this(AbstractC0718e.yandex(c0388e4)), "android_asset")) {
                    return null;
                }
                return new C3692e(c0388e4, c6302e, i3);
            case 9:
                C0388e c0388e5 = (C0388e) obj;
                if (AbstractC7890e.billing(c0388e5.metrica, "jar:file")) {
                    return new C3692e(c0388e5, c6302e, 3);
                }
                return null;
            default:
                C0388e c0388e6 = (C0388e) obj;
                if (AbstractC7890e.billing(c0388e6.metrica, "android.resource")) {
                    return new C3692e(c0388e6, c6302e, 4);
                }
                return null;
        }
    }
}
