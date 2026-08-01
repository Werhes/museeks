package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۟ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8248e extends AbstractC11130e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static C8248e f16749e;

    @Override // defpackage.AbstractC11130e
    /* renamed from: const */
    public final int[] mo450const(int i) {
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length) {
            String str2 = (String) this.f22047e;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || m2391e(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m2392e(i2)) {
            i2++;
        }
        return m3033e(i, i2);
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public final boolean m2391e(int i) {
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = (String) this.f22047e;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eًٓؓ */
    public final int[] mo454e(int i) {
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            String str2 = (String) this.f22047e;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || m2392e(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !m2391e(i2)) {
            i2--;
        }
        return m3033e(i2, i);
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final boolean m2392e(int i) {
        if (i <= 0) {
            return false;
        }
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = (String) this.f22047e;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = (String) this.f22047e;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }
}
