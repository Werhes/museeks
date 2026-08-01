package defpackage;

import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12267e implements InterfaceC14710e {
    public static final byte[] purchase = new byte[0];
    public final byte[] ad;
    public final byte[] appmetrica;
    public final InterfaceC17063e license;
    public final C0680e metrica;
    public final C3168e vip;

    public C12267e(C15768e c15768e, C3168e c3168e, C0680e c0680e, InterfaceC17063e interfaceC17063e, C15768e c15768e2) {
        this.ad = c15768e.vip();
        this.vip = c3168e;
        this.metrica = c0680e;
        this.license = interfaceC17063e;
        this.appmetrica = c15768e2.vip();
    }

    @Override // defpackage.InterfaceC14710e
    public final byte[] ad(byte[] bArr) {
        int i;
        C9714e c9714e;
        byte[] bArr2 = new byte[0];
        C3168e c3168e = this.vip;
        int i2 = c3168e.f7273e;
        byte[] bArr3 = this.ad;
        switch (i2) {
            case 5:
                i = 0;
                EnumC6205e enumC6205e = (EnumC6205e) c3168e.f7271e;
                KeyPair smaato = AbstractC16091e.smaato(AbstractC16091e.loadAd(enumC6205e));
                ECParameterSpec loadAd = AbstractC16091e.loadAd(enumC6205e);
                EllipticCurve curve = loadAd.getCurve();
                EnumC1901e enumC1901e = EnumC1901e.f5061e;
                byte[] appmetrica = AbstractC16091e.appmetrica((ECPrivateKey) smaato.getPrivate(), (ECPublicKey) ((KeyFactory) C7174e.purchase.ad.isPro("EC")).generatePublic(new ECPublicKeySpec(AbstractC16091e.inmobi(curve, enumC1901e, bArr3), loadAd)));
                byte[] isPro = AbstractC16091e.isPro(AbstractC16091e.loadAd(enumC6205e).getCurve(), enumC1901e, ((ECPublicKey) smaato.getPublic()).getW());
                byte[] ad = AbstractC7640e.ad(isPro, bArr3);
                byte[] ad2 = AbstractC7640e.ad(AbstractC0097e.smaato, c3168e.m1244e());
                C0680e c0680e = (C0680e) c3168e.f7272e;
                int macLength = Mac.getInstance(c0680e.ad).getMacLength();
                byte[] bArr4 = AbstractC0097e.loadAd;
                Charset charset = AbstractC6336e.ad;
                c9714e = new C9714e(c0680e.ad(c0680e.vip(AbstractC7640e.ad(bArr4, ad2, "eae_prk".getBytes(charset), appmetrica), null), macLength, AbstractC7640e.ad(AbstractC0097e.vip(2, macLength), bArr4, ad2, "shared_secret".getBytes(charset), ad)), isPro);
                break;
            default:
                InterfaceC16567e interfaceC16567e = (InterfaceC16567e) c3168e.f7272e;
                C2873e appmetrica2 = interfaceC16567e.appmetrica();
                byte[] bArr5 = appmetrica2.ad;
                byte[] bArr6 = appmetrica2.vip;
                byte[] startapp = interfaceC16567e.startapp(bArr5, bArr3);
                byte[] ad3 = AbstractC7640e.ad(bArr6, bArr3);
                byte[] ad4 = AbstractC7640e.ad(AbstractC0097e.smaato, AbstractC0097e.vip);
                C0680e c0680e2 = (C0680e) c3168e.f7271e;
                int macLength2 = Mac.getInstance(c0680e2.ad).getMacLength();
                byte[] bArr7 = AbstractC0097e.loadAd;
                i = 0;
                Charset charset2 = AbstractC6336e.ad;
                c9714e = new C9714e(c0680e2.ad(c0680e2.vip(AbstractC7640e.ad(bArr7, ad4, "eae_prk".getBytes(charset2), startapp), null), macLength2, AbstractC7640e.ad(AbstractC0097e.vip(2, macLength2), bArr7, ad4, "shared_secret".getBytes(charset2), ad3)), bArr6);
                break;
        }
        C2532e m876this = C2532e.m876this(AbstractC0097e.ad, c9714e.vip, c9714e.ad, c3168e, this.metrica, this.license, bArr2);
        byte[] bArr8 = (byte[]) m876this.f6384e;
        byte[] bArr9 = this.appmetrica;
        byte[] startapp2 = ((InterfaceC17063e) m876this.f6388e).startapp((byte[]) m876this.f6385e, m876this.m925interface(), bArr, bArr9.length + bArr8.length, purchase);
        int i3 = i;
        System.arraycopy(bArr9, i3, startapp2, i3, bArr9.length);
        System.arraycopy(bArr8, i3, startapp2, bArr9.length, bArr8.length);
        return startapp2;
    }
}
