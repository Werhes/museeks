package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13604e extends C16299e {
    public final char[] purchase;

    public C13604e(C16298e c16298e) {
        super(c16298e, (Character) null);
        this.purchase = new char[AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE];
        char[] cArr = c16298e.vip;
        AbstractC2301e.billing(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.purchase;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = cArr[i & 15];
        }
    }

    @Override // defpackage.C16299e
    public final void metrica(StringBuilder sb, byte[] bArr, int i) {
        AbstractC2301e.Signature(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.purchase;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES]);
        }
    }
}
