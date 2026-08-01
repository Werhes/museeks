package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5949e extends AbstractC15023e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12530e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C5949e f12529e = new C5949e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C5949e f12528e = new C5949e(1);

    public /* synthetic */ C5949e(int i) {
        this.f12530e = i;
    }

    @Override // defpackage.AbstractC15023e
    public final AbstractC15023e ad() {
        switch (this.f12530e) {
            case 0:
                return f12528e;
            default:
                return f12529e;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12530e) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f12530e) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
