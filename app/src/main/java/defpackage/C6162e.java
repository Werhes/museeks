package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6162e implements InterfaceC5142e {
    public final String ad;

    public C6162e(String str) {
        this.ad = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (AbstractC11613e.subscription(str.charAt(0))) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("String '", str, "' starts with a digit").toString());
        }
        if (AbstractC11613e.subscription(str.charAt(str.length() - 1))) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("String '", str, "' ends with a digit").toString());
        }
    }

    @Override // defpackage.InterfaceC5142e
    public final Object ad(InterfaceC5374e interfaceC5374e, CharSequence charSequence, int i) {
        String str = this.ad;
        if (str.length() + i > charSequence.length()) {
            return new C7883e(i, new C13465e(13, this));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new C7883e(i, new C10256e(this, charSequence, i, i2));
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("'"), this.ad, '\'');
    }
}
