package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15608e extends Exception {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30789e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30790e;

    public C15608e(int i, String str) {
        this.f30789e = i;
        this.f30790e = str;
    }

    public static C15608e ad(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (str2 != null) {
            if (sb.length() > 0) {
                sb.append(" - ");
            }
            sb.append(str2);
        }
        return sb.length() > 0 ? new C15608e(i, sb.toString()) : new C15608e(i, null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = this.f30789e;
        String str = this.f30790e;
        if (str == null) {
            return AbstractC1634e.appmetrica(i);
        }
        return AbstractC1634e.appmetrica(i) + ": " + str;
    }
}
