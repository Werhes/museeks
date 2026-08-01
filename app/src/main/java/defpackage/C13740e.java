package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13740e {
    public static final byte[] appmetrica = new byte[1792];
    public final CharSequence ad;
    public char license;
    public int metrica;
    public final int vip;

    static {
        for (int i = 0; i < 1792; i++) {
            appmetrica[i] = Character.getDirectionality(i);
        }
    }

    public C13740e(CharSequence charSequence) {
        this.ad = charSequence;
        this.vip = charSequence.length();
    }

    public final byte ad() {
        int i = this.metrica - 1;
        CharSequence charSequence = this.ad;
        char charAt = charSequence.charAt(i);
        this.license = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.metrica);
            this.metrica -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.metrica--;
        char c = this.license;
        return c < 1792 ? appmetrica[c] : Character.getDirectionality(c);
    }
}
