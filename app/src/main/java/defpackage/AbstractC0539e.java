package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0539e {
    public static final /* synthetic */ int ad = 0;

    static {
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((b & 2) == 0) {
            sb.append(" skipChecks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
