package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17443e extends AbstractC4244e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C7936e f34165e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f34166e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f34167e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f34165e = new C7936e(2);
    }

    public final void ad() {
        C8905e c8905e = this.f20986e;
        int i = 0;
        byte b = c8905e.license()[0];
        byte[] license = c8905e.license();
        C7936e c7936e = AbstractC1983e.ad;
        AbstractC1983e.license(ByteBuffer.wrap(license), 1, 2);
        this.f34166e = null;
        this.f34167e = null;
        for (int i2 = 5; i2 < c8905e.license().length - 1; i2 += 2) {
            if (c8905e.license()[i2] == 0 && c8905e.license()[i2 + 1] == 0) {
                if (this.f34166e == null) {
                    this.f34166e = new String(c8905e.license(), 5, i2 - 5, "UTF-16LE");
                    i = i2 + 2;
                } else if (this.f34167e == null) {
                    this.f34167e = new String(c8905e.license(), i, i2 - i, "UTF-16LE");
                    return;
                }
            }
        }
    }
}
