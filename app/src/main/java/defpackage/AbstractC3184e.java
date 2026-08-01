package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3184e implements InterfaceC18116e {
    public static final C2242e ad = new Object();

    public abstract String ad();

    public String appmetrica() {
        return null;
    }

    public abstract String license();

    public abstract int metrica();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(ad());
        sb.append(", method=");
        sb.append(vip());
        sb.append(", line=");
        sb.append(metrica());
        if (license() != null) {
            sb.append(", file=");
            sb.append(license());
        }
        if (appmetrica() != null) {
            sb.append(", filePath=");
            sb.append(appmetrica());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract String vip();
}
