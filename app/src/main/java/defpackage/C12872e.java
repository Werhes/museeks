package defpackage;

import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12872e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f25715e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f25716e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f25717e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25718e;

    public /* synthetic */ C12872e(int i, int i2, C14742e c14742e, int i3) {
        this.f25718e = i3;
        this.f25716e = i;
        this.f25715e = i2;
        this.f25717e = c14742e;
    }

    public /* synthetic */ C12872e(Object obj, int i, int i2, int i3) {
        this.f25718e = i3;
        this.f25717e = obj;
        this.f25716e = i;
        this.f25715e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f25718e;
        int i2 = this.f25715e;
        int i3 = this.f25716e;
        Object obj2 = this.f25717e;
        switch (i) {
            case 0:
                C14742e c14742e = (C14742e) obj2;
                C2573e c2573e = (C2573e) obj;
                long adcel = c14742e.adcel(AbstractC9262e.metrica(0, c2573e.f6429e.length()));
                int billing = C12347e.billing(adcel);
                int purchase = C12347e.purchase(adcel);
                if (i3 < billing) {
                    i3 = billing;
                }
                if (i3 <= purchase) {
                    purchase = i3;
                }
                int billing2 = C12347e.billing(adcel);
                int purchase2 = C12347e.purchase(adcel);
                if (i2 < billing2) {
                    i2 = billing2;
                }
                if (i2 <= purchase2) {
                    purchase2 = i2;
                }
                c2573e.billing(c14742e.startapp(AbstractC9262e.metrica(purchase, purchase2)));
                return Unit.INSTANCE;
            case 1:
                C14742e c14742e2 = (C14742e) obj2;
                Csuper csuper = (Csuper) c14742e2.metrica;
                C2573e c2573e2 = (C2573e) obj;
                if (i3 < 0 || i2 < 0) {
                    AbstractC8889e.ad("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long adcel2 = c14742e2.adcel(c2573e2.f6428e);
                int i4 = C12347e.metrica;
                int i5 = (int) (4294967295L & adcel2);
                int i6 = i5 + i2;
                if (((i2 ^ i6) & (i5 ^ i6)) < 0) {
                    i6 = csuper.m4642class();
                }
                long startapp = c14742e2.startapp(AbstractC9262e.metrica(i5, Math.min(i6, csuper.m4642class())));
                AbstractC6286e.appmetrica(c2573e2, C12347e.billing(startapp), C12347e.purchase(startapp));
                int i7 = (int) (adcel2 >> 32);
                int i8 = i7 - i3;
                if (((i7 ^ i3) & (i7 ^ i8)) < 0) {
                    i8 = 0;
                }
                long startapp2 = c14742e2.startapp(AbstractC9262e.metrica(Math.max(0, i8), i7));
                AbstractC6286e.appmetrica(c2573e2, C12347e.billing(startapp2), C12347e.purchase(startapp2));
                return Unit.INSTANCE;
            case 2:
                C14742e c14742e3 = (C14742e) obj2;
                C2573e c2573e3 = (C2573e) obj;
                C12347e c12347e = c2573e3.f6435e;
                C4860e c4860e = c2573e3.f6429e;
                if (c12347e != null) {
                    c2573e3.purchase(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long startapp3 = c14742e3.startapp(AbstractC9262e.metrica(i3, i2));
                int metrica = AbstractC3062e.metrica(C12347e.billing(startapp3), 0, c4860e.length());
                int metrica2 = AbstractC3062e.metrica(C12347e.purchase(startapp3), 0, c4860e.length());
                if (metrica != metrica2) {
                    if (metrica < metrica2) {
                        c2573e3.appmetrica(metrica, metrica2, null);
                    } else {
                        c2573e3.appmetrica(metrica2, metrica, null);
                    }
                }
                return Unit.INSTANCE;
            default:
                C17985e c17985e = (C17985e) obj2;
                C4864e c4864e = (C4864e) obj;
                C6342e c6342e = c4864e.ad;
                int license = c4864e.license(i3);
                int license2 = c4864e.license(i2);
                CharSequence charSequence = (CharSequence) c6342e.f13182e;
                if (license < 0 || license > license2 || license2 > charSequence.length()) {
                    StringBuilder pro = AbstractC17861e.pro(license, license2, "start(", ") or end(", ") is out of range [0..");
                    pro.append(charSequence.length());
                    pro.append("], or start > end!");
                    AbstractC5525e.ad(pro.toString());
                }
                Path path = new Path();
                C6458e c6458e = (C6458e) c6342e.f13185e;
                c6458e.purchase.getSelectionPath(license, license2, path);
                int i9 = c6458e.yandex;
                if (i9 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i9);
                }
                C17985e c17985e2 = new C17985e(path);
                float f = c4864e.purchase;
                c17985e2.advert((4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits(0.0f) << 32));
                c17985e.ad(c17985e2, 0L);
                return Unit.INSTANCE;
        }
    }
}
