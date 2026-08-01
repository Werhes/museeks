package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6161e extends C16722e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f12930e;

    public C6161e(InterfaceC9483e interfaceC9483e, boolean z) {
        super((Object) interfaceC9483e, 3, false);
        this.f12930e = z;
    }

    @Override // defpackage.C16722e
    public final void admob(int i) {
        if (this.f12930e) {
            signatures(Long.toString(4294967295L & i, 10));
        } else {
            remoteconfig(Long.toString(4294967295L & i, 10));
        }
    }

    @Override // defpackage.C16722e
    public final void loadAd(byte b) {
        if (this.f12930e) {
            signatures(String.valueOf(b & 255));
        } else {
            remoteconfig(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.C16722e
    public final void pro(short s) {
        if (this.f12930e) {
            signatures(String.valueOf(s & 65535));
        } else {
            remoteconfig(String.valueOf(s & 65535));
        }
    }

    @Override // defpackage.C16722e
    public final void subscription(long j) {
        int i = 63;
        String str = "0";
        if (this.f12930e) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            signatures(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / 5;
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        remoteconfig(str);
    }
}
