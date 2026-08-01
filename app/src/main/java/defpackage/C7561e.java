package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7561e implements InterfaceC14710e {
    public static final C5720e billing;
    public static final C5720e yandex;
    public final C13935e ad;
    public final InterfaceC18515e appmetrica;
    public final EnumC1901e license;
    public final byte[] metrica;
    public final byte[] purchase;
    public final String vip;

    static {
        C17424e ad = C5720e.ad();
        ad.advert(EnumC6205e.f12969e, C16149e.vip);
        ad.advert(EnumC6205e.f12967e, C16149e.metrica);
        ad.advert(EnumC6205e.f12966e, C16149e.license);
        billing = ad.Signature();
        C17424e ad2 = C5720e.ad();
        ad2.advert(EnumC1901e.f5061e, C13194e.metrica);
        ad2.advert(EnumC1901e.f5059e, C13194e.vip);
        ad2.advert(EnumC1901e.f5058e, C13194e.license);
        yandex = ad2.Signature();
    }

    public C7561e(ECPublicKey eCPublicKey, byte[] bArr, String str, EnumC1901e enumC1901e, InterfaceC18515e interfaceC18515e, byte[] bArr2) {
        AbstractC2827e.vip(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.ad = new C13935e(eCPublicKey);
        this.metrica = bArr;
        this.vip = str;
        this.license = enumC1901e;
        this.appmetrica = interfaceC18515e;
        this.purchase = bArr2;
    }

    public static final String vip(C1906e c1906e) {
        if (c1906e.equals(C1906e.vip)) {
            return "HmacSha1";
        }
        if (c1906e.equals(C1906e.metrica)) {
            return "HmacSha224";
        }
        if (c1906e.equals(C1906e.license)) {
            return "HmacSha256";
        }
        if (c1906e.equals(C1906e.appmetrica)) {
            return "HmacSha384";
        }
        if (c1906e.equals(C1906e.purchase)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: " + c1906e);
    }

    @Override // defpackage.InterfaceC14710e
    public final byte[] ad(byte[] bArr) {
        InterfaceC18515e interfaceC18515e = this.appmetrica;
        int mopub = interfaceC18515e.mopub();
        ECPublicKey eCPublicKey = (ECPublicKey) this.ad.f27641e;
        KeyPair smaato = AbstractC16091e.smaato(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) smaato.getPublic();
        byte[] appmetrica = AbstractC16091e.appmetrica((ECPrivateKey) smaato.getPrivate(), eCPublicKey);
        byte[] isPro = AbstractC16091e.isPro(eCPublicKey2.getParams().getCurve(), this.license, eCPublicKey2.getW());
        return interfaceC18515e.metrica(C15768e.ad(AbstractC2301e.remoteconfig(mopub, this.vip, isPro, appmetrica, this.metrica)).vip(), this.purchase, C15768e.ad(isPro).vip(), bArr);
    }
}
