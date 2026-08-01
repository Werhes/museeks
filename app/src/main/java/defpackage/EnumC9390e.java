package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC9390e implements InterfaceC7277e {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    FORMAT_UPC_A(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE),
    FORMAT_UPC_E(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18666e;

    EnumC9390e(int i) {
        this.f18666e = i;
    }

    @Override // defpackage.InterfaceC7277e
    public final int ad() {
        return this.f18666e;
    }
}
