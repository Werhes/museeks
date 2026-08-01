package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5800e {
    public static final C5800e vip = new C5800e();
    public final boolean ad = true;

    public C5800e() {
        if (AbstractC2194e.vip(BuildConfig.FLAVOR)) {
            return;
        }
        AbstractC2194e.vip(BuildConfig.FLAVOR);
    }

    public final void ad(String str, StringBuilder sb) {
        AbstractC13501e.Signature(sb, str, "prefix = \"", BuildConfig.FLAVOR, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append(BuildConfig.FLAVOR);
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        ad("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
