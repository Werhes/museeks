package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13141e implements InterfaceC6066e {
    public final /* synthetic */ int ad;

    static {
        int i = C18521e.vip;
    }

    public /* synthetic */ C13141e(int i) {
        this.ad = i;
    }

    public static void vip(AbstractC6649e abstractC6649e) {
        if (abstractC6649e == null || abstractC6649e.ad()) {
            return;
        }
        C14226e c14226e = new C14226e((abstractC6649e instanceof AbstractC6649e ? new C14803e() : new C14803e()).getMessage());
        c14226e.f28108e = abstractC6649e;
        throw c14226e;
    }

    @Override // defpackage.InterfaceC6066e
    public final Object ad(C4285e c4285e, C18521e c18521e) {
        switch (this.ad) {
            case 0:
                return new C17298e(c4285e);
            case 1:
                return new C17758e(c4285e);
            case 2:
                return new C4442e(c4285e, c18521e);
            case 3:
                return new C12499e(c4285e, c18521e);
            case 4:
                return new C8726e(c4285e);
            case 5:
                return new C4599e(c4285e, c18521e);
            case 6:
                return new C14481e(c4285e, c18521e);
            case 7:
                return new C3545e(c4285e, c18521e);
            case 8:
                return new C2009e(c4285e, c18521e);
            case 9:
                return new C18181e(c4285e);
            case 10:
                return new C11505e(c4285e, c18521e);
            case 11:
                return new C4307e(c4285e, c18521e);
            case 12:
                return new C12000e(c4285e, c18521e);
            case 13:
                return new C13754e(c4285e, c18521e);
            case 14:
                return new C3845e(c4285e, c18521e);
            case 15:
                return new C9920e(c4285e, c18521e);
            case 16:
                return new C14882e(c4285e, c18521e);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C15503e(c4285e, c18521e);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C17485e(c4285e, c18521e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C12162e(c4285e, c18521e);
            case 20:
                return new C10905e(c4285e);
            case 21:
                return new C8244e(c4285e);
            case 22:
                return new C13212e(c4285e, c18521e);
            case 23:
                return new C16578e(c4285e, c18521e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C16162e(c4285e, c18521e);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C8372e(c4285e, c18521e);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C3526e(c4285e, c18521e);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C10067e(c4285e, c18521e);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C12994e(c4285e);
            default:
                return new C2553e(c4285e, c18521e);
        }
    }

    public final AbstractC6649e metrica(ByteArrayInputStream byteArrayInputStream, C18521e c18521e) {
        AbstractC6649e abstractC6649e;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                abstractC6649e = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        if (i >= 32) {
                            while (i < 64) {
                                int read2 = byteArrayInputStream.read();
                                if (read2 == -1) {
                                    throw C14226e.vip();
                                }
                                if ((read2 & 128) != 0) {
                                    i += 7;
                                }
                            }
                            throw new C14226e("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = byteArrayInputStream.read();
                        if (read3 == -1) {
                            throw C14226e.vip();
                        }
                        read |= (read3 & 127) << i;
                        if ((read3 & 128) == 0) {
                            break;
                        }
                        i += 7;
                    }
                }
                C4285e c4285e = new C4285e(new C3280e(byteArrayInputStream, read));
                AbstractC6649e abstractC6649e2 = (AbstractC6649e) ad(c4285e, c18521e);
                try {
                    c4285e.ad(0);
                    abstractC6649e = abstractC6649e2;
                } catch (C14226e e) {
                    e.f28108e = abstractC6649e2;
                    throw e;
                }
            }
            vip(abstractC6649e);
            return abstractC6649e;
        } catch (IOException e2) {
            throw new C14226e(e2.getMessage());
        }
    }
}
