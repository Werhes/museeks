package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8148e implements InterfaceC7304e {
    public static final byte[] billing = new byte[0];
    public final C17424e ad;
    public final int appmetrica;
    public final InterfaceC17063e license;
    public final C0680e metrica;
    public final byte[] purchase;
    public final C3168e vip;

    public C8148e(C17424e c17424e, C3168e c3168e, C0680e c0680e, InterfaceC17063e interfaceC17063e, int i, C15768e c15768e) {
        this.ad = c17424e;
        this.vip = c3168e;
        this.metrica = c0680e;
        this.license = interfaceC17063e;
        this.appmetrica = i;
        this.purchase = c15768e.vip();
    }

    @Override // defpackage.InterfaceC7304e
    public final byte[] ad(byte[] bArr) {
        byte[] ad;
        byte[] bArr2 = this.purchase;
        int length = bArr2.length + this.appmetrica;
        if (bArr.length < length) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!AbstractC6336e.vip(bArr2, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArr3 = new byte[0];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, length);
        C3168e c3168e = this.vip;
        int i = c3168e.f7273e;
        C17424e c17424e = this.ad;
        switch (i) {
            case 5:
                EnumC6205e enumC6205e = (EnumC6205e) c3168e.f7271e;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(AbstractC7354e.vip(((C15768e) c17424e.f34142e).vip()), AbstractC16091e.loadAd(enumC6205e));
                C7174e c7174e = C7174e.purchase;
                ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) c7174e.ad.isPro("EC")).generatePrivate(eCPrivateKeySpec);
                ECParameterSpec loadAd = AbstractC16091e.loadAd(enumC6205e);
                byte[] appmetrica = AbstractC16091e.appmetrica(eCPrivateKey, (ECPublicKey) ((KeyFactory) c7174e.ad.isPro("EC")).generatePublic(new ECPublicKeySpec(AbstractC16091e.inmobi(loadAd.getCurve(), EnumC1901e.f5061e, copyOfRange), loadAd)));
                byte[] ad2 = AbstractC7640e.ad(copyOfRange, ((C15768e) c17424e.f34141e).vip());
                byte[] ad3 = AbstractC7640e.ad(AbstractC0097e.smaato, c3168e.m1244e());
                C0680e c0680e = (C0680e) c3168e.f7272e;
                int macLength = Mac.getInstance(c0680e.ad).getMacLength();
                byte[] bArr4 = AbstractC0097e.loadAd;
                Charset charset = AbstractC6336e.ad;
                ad = c0680e.ad(c0680e.vip(AbstractC7640e.ad(bArr4, ad3, "eae_prk".getBytes(charset), appmetrica), null), macLength, AbstractC7640e.ad(AbstractC0097e.vip(2, macLength), bArr4, ad3, "shared_secret".getBytes(charset), ad2));
                break;
            default:
                byte[] startapp = ((InterfaceC16567e) c3168e.f7272e).startapp(((C15768e) c17424e.f34142e).vip(), copyOfRange);
                byte[] ad4 = AbstractC7640e.ad(copyOfRange, ((C15768e) c17424e.f34141e).vip());
                byte[] ad5 = AbstractC7640e.ad(AbstractC0097e.smaato, AbstractC0097e.vip);
                C0680e c0680e2 = (C0680e) c3168e.f7271e;
                int macLength2 = Mac.getInstance(c0680e2.ad).getMacLength();
                byte[] bArr5 = AbstractC0097e.loadAd;
                Charset charset2 = AbstractC6336e.ad;
                ad = c0680e2.ad(c0680e2.vip(AbstractC7640e.ad(bArr5, ad5, "eae_prk".getBytes(charset2), startapp), null), macLength2, AbstractC7640e.ad(AbstractC0097e.vip(2, macLength2), bArr5, ad5, "shared_secret".getBytes(charset2), ad4));
                break;
        }
        C2532e m876this = C2532e.m876this(AbstractC0097e.ad, copyOfRange, ad, c3168e, this.metrica, this.license, bArr3);
        return ((InterfaceC17063e) m876this.f6388e).billing((byte[]) m876this.f6385e, m876this.m925interface(), bArr, length, billing);
    }
}
