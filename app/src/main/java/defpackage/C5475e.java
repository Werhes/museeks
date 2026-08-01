package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5475e {
    public static final C5475e metrica = new C5475e(C17741e.license, C5800e.vip);
    public final C17741e ad;
    public final C5800e vip;

    public C5475e(C17741e c17741e, C5800e c5800e) {
        this.ad = c17741e;
        this.vip = c5800e;
    }

    public final String toString() {
        StringBuilder inmobi = AbstractC8703e.inmobi("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.ad.ad("        ", inmobi);
        inmobi.append('\n');
        inmobi.append("    ),");
        inmobi.append('\n');
        inmobi.append("    number = NumberHexFormat(");
        inmobi.append('\n');
        this.vip.ad("        ", inmobi);
        inmobi.append('\n');
        inmobi.append("    )");
        inmobi.append('\n');
        inmobi.append(")");
        return inmobi.toString();
    }
}
