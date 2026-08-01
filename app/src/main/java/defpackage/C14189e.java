package defpackage;

import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14189e implements InterfaceC16681e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f28038e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f28039e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f28040e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28041e;

    public C14189e(String str, int i, String str2) {
        this.f28041e = i;
        switch (i) {
            case 1:
                this.f28040e = str.toUpperCase();
                this.f28038e = str2;
                ad();
                return;
            default:
                String upperCase = str.toUpperCase();
                this.f28040e = upperCase;
                this.f28038e = str2;
                this.f28039e = upperCase.equals("TITLE") || upperCase.equals("ALBUM") || upperCase.equals("ARTIST") || upperCase.equals("GENRE") || upperCase.equals("YEAR") || upperCase.equals("COMMENT") || upperCase.equals("TRACK");
                return;
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        switch (this.f28041e) {
            case 0:
                return this.f28039e;
            default:
                return this.f28039e;
        }
    }

    public void ad() {
        String str = this.f28040e;
        this.f28039e = str.equals(EnumC13303e.f26451e.f26533e) || str.equals(EnumC13303e.f26475e.f26533e) || str.equals(EnumC13303e.f26387e.f26533e) || str.equals(EnumC13303e.f26423e.f26533e) || str.equals(EnumC13303e.f26509e.f26533e) || str.equals(EnumC13303e.f26384e.f26533e) || str.equals(EnumC13303e.f26417e.f26533e) || str.equals(EnumC13303e.f26460e.f26533e);
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        switch (this.f28041e) {
            case 0:
                return this.f28040e;
            default:
                return this.f28040e;
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        switch (this.f28041e) {
            case 0:
                return BuildConfig.FLAVOR.equals(this.f28038e);
            default:
                return this.f28038e.equals(BuildConfig.FLAVOR);
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        switch (this.f28041e) {
            case 0:
                String str = this.f28040e;
                Charset charset = AbstractC4639e.vip;
                byte[] bytes = str.getBytes(charset);
                byte[] bytes2 = this.f28038e.getBytes(charset);
                byte[] bArr = new byte[bytes.length + 5 + bytes2.length];
                int length = bytes.length + 1 + bytes2.length;
                System.arraycopy(new byte[]{(byte) (length & 255), (byte) ((65280 & length) >> 8), (byte) ((16711680 & length) >> 16), (byte) (((-16777216) & length) >> 24)}, 0, bArr, 0, 4);
                System.arraycopy(bytes, 0, bArr, 4, bytes.length);
                int length2 = bytes.length;
                bArr[4 + length2] = 61;
                System.arraycopy(bytes2, 0, bArr, length2 + 5, bytes2.length);
                return bArr;
            default:
                byte[] bytes3 = this.f28040e.getBytes(AbstractC4639e.vip);
                byte[] bytes4 = this.f28038e.getBytes(AbstractC4639e.metrica);
                byte[] bArr2 = new byte[bytes3.length + 5 + bytes4.length];
                int length3 = bytes3.length + 1 + bytes4.length;
                System.arraycopy(new byte[]{(byte) (length3 & 255), (byte) ((65280 & length3) >> 8), (byte) ((16711680 & length3) >> 16), (byte) (((-16777216) & length3) >> 24)}, 0, bArr2, 0, 4);
                System.arraycopy(bytes3, 0, bArr2, 4, bytes3.length);
                int length4 = bytes3.length;
                bArr2[4 + length4] = 61;
                System.arraycopy(bytes4, 0, bArr2, length4 + 5, bytes4.length);
                return bArr2;
        }
    }

    @Override // defpackage.InterfaceC3589e
    public final String toString() {
        switch (this.f28041e) {
            case 0:
                return this.f28038e;
            default:
                return this.f28038e;
        }
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        switch (this.f28041e) {
            case 0:
                return this.f28038e;
            default:
                return this.f28038e;
        }
    }
}
