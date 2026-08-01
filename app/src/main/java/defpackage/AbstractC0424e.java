package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0424e {
    public byte ad;

    public AbstractC0424e() {
        this.ad = (byte) 0;
    }

    public AbstractC0424e(byte b) {
        this.ad = b;
    }

    public byte ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0424e) && ((long) ad()) == ((long) ((AbstractC0424e) obj).ad());
    }
}
