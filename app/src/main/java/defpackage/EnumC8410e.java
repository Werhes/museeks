package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8410e {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC8410e[] f17188e = new EnumC8410e[26];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f17189e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f17190e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f17191e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char f17192e;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    static {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EnumC8410e.<clinit>():void");
    }

    EnumC8410e(char c, int i, String str, boolean z) {
        this.f17192e = c;
        this.f17190e = i;
        C15794e c15794e = C15794e.appmetrica;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int charAt = ((int) ((C15794e.license >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i2 |= 1 << charAt;
        }
        this.f17189e = i2;
        this.f17191e = AbstractC4653e.applovin(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
