package defpackage;

import androidx.car.app.model.Alert;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17741e {
    public static final C17741e license = new C17741e();
    public final boolean metrica;
    public final boolean ad = true;
    public final boolean vip = true;

    public C17741e() {
        boolean z = true;
        if (!AbstractC2194e.vip("  ") && !AbstractC2194e.vip(BuildConfig.FLAVOR) && !AbstractC2194e.vip(BuildConfig.FLAVOR) && !AbstractC2194e.vip(BuildConfig.FLAVOR)) {
            z = false;
        }
        this.metrica = z;
    }

    public final void ad(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Alert.DURATION_SHOW_INDEFINITELY);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append(BuildConfig.FLAVOR);
        sb.append("\",");
        sb.append('\n');
        AbstractC13501e.Signature(sb, str, "bytePrefix = \"", BuildConfig.FLAVOR, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append(BuildConfig.FLAVOR);
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        ad("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
