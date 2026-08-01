package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5646e extends C7507e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f12034e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f12035e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f12036e;

    @Override // defpackage.C7507e
    public final void amazon() {
        super.amazon();
        this.f12036e = 0;
    }

    public final boolean pro() {
        return this.f12036e > 0;
    }

    public final boolean remoteconfig(C7507e c7507e) {
        ByteBuffer byteBuffer;
        AbstractC2301e.billing(!c7507e.metrica(1073741824));
        AbstractC2301e.billing(!c7507e.metrica(268435456));
        AbstractC2301e.billing(!c7507e.metrica(4));
        if (pro()) {
            if (this.f12036e >= this.f12034e) {
                return false;
            }
            ByteBuffer byteBuffer2 = c7507e.f15296e;
            if (byteBuffer2 != null && (byteBuffer = this.f15296e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f12036e;
        this.f12036e = i + 1;
        if (i == 0) {
            this.f15301e = c7507e.f15301e;
            if (c7507e.metrica(1)) {
                this.f19062e = 1;
            }
        }
        ByteBuffer byteBuffer3 = c7507e.f15296e;
        if (byteBuffer3 != null) {
            admob(byteBuffer3.remaining());
            this.f15296e.put(byteBuffer3);
        }
        this.f12035e = c7507e.f15301e;
        return true;
    }
}
