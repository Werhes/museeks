package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15780e implements InterfaceC14567e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15780e f31085e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15780e f31086e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15780e f31087e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31088e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31089e;

    static {
        int i = 0;
        f31086e = new C15780e("TINK", i);
        f31087e = new C15780e("CRUNCHY", i);
        f31085e = new C15780e("NO_PREFIX", i);
    }

    public /* synthetic */ C15780e(String str, int i) {
        this.f31089e = i;
        this.f31088e = str;
    }

    @Override // defpackage.InterfaceC14567e
    public Object appmetrica() {
        return this;
    }

    public String toString() {
        switch (this.f31089e) {
            case 0:
                return this.f31088e;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC14567e
    public boolean yandex(CharSequence charSequence, int i, int i2, C17115e c17115e) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f31088e)) {
            return true;
        }
        c17115e.metrica = (c17115e.metrica & 3) | 4;
        return false;
    }
}
