package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;

/* renamed from: eٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16324e implements PrivateKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f32071e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f32072e;

    public C16324e(Ctry ctry, PrivateKey... privateKeyArr) {
        this.f32071e = new C16527e(ctry);
        if (privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one private key must be provided for the composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            if (privateKey instanceof InterfaceC0737e) {
                try {
                    privateKey = ((InterfaceC0737e) privateKey).getPrivateKey(true);
                } catch (Exception unused) {
                }
            }
            arrayList.add(privateKey);
        }
        this.f32072e = DesugarCollections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16324e) {
            C16324e c16324e = (C16324e) obj;
            if (c16324e.f32071e.equals(this.f32071e) && this.f32072e.equals(c16324e.f32072e)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.f32071e.f32408e);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r5v8, types: [extends, catch, eًٌَ] */
    @Override // java.security.Key
    public final byte[] getEncoded() {
        C16527e c16527e = this.f32071e;
        boolean m4675native = c16527e.f32408e.m4675native(InterfaceC18193e.appmetrica);
        int i = 0;
        List list = this.f32072e;
        if (!m4675native) {
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            if (!c16527e.f32408e.isVip(InterfaceC14178e.tapsense)) {
                byte[] bArr = null;
                while (i < list.size()) {
                    bArr = AbstractC12442e.adcel(bArr, C7179e.loadAd(((PrivateKey) list.get(i)).getEncoded()).Signature().f36449e);
                    i++;
                }
                try {
                    return new C7179e(c16527e, bArr, (Cfinal) null, (byte[]) null).smaato();
                } catch (IOException e) {
                    throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("unable to encode composite private key: ")));
                }
            }
            while (i < list.size()) {
                crashlyticsVar.appmetrica(C7179e.loadAd(((PrivateKey) list.get(i)).getEncoded()));
                i++;
            }
            try {
                ?? ccatch = new Ccatch(crashlyticsVar);
                ccatch.f20096e = -1;
                return new C7179e(c16527e, (Cextends) ccatch, (Cfinal) null, (byte[]) null).smaato();
            } catch (IOException e2) {
                throw new IllegalStateException(AbstractC8703e.admob(e2, new StringBuilder("unable to encode composite private key: ")));
            }
        }
        try {
            byte[] seed = ((InterfaceC0737e) list.get(0)).getSeed();
            byte[] bArr2 = AbstractC0242e.ad(AbstractC2251e.license(((PrivateKey) list.get(1)).getEncoded()), null).Signature().f36449e;
            if (((PrivateKey) list.get(1)).getAlgorithm().contains("Ed")) {
                bArr2 = Cprotected.subs(bArr2).f36449e;
            } else if (((PrivateKey) list.get(1)).getAlgorithm().contains("EC")) {
                C8101e loadAd = C8101e.loadAd(bArr2);
                int advert = AbstractC16377e.appmetrica(Ctry.m4669interface(loadAd.admob(0, -1))).f18531e.f34438e.advert();
                BigInteger Signature = loadAd.Signature();
                Cdefault admob = loadAd.admob(0, -1);
                byte[] ad = AbstractC5907e.ad((advert + 7) / 8, Signature);
                crashlytics crashlyticsVar2 = new crashlytics(4, 0);
                crashlyticsVar2.appmetrica(new Cthis(1L));
                crashlyticsVar2.appmetrica(new Cprotected(ad));
                if (admob != null) {
                    crashlyticsVar2.appmetrica(new Cstrictfp(true, 0, admob));
                }
                ?? ccatch2 = new Ccatch(crashlyticsVar2);
                ccatch2.f20096e = -1;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ccatch2.Signature(new C7850e(1, byteArrayOutputStream), true);
                bArr2 = byteArrayOutputStream.toByteArray();
            }
            return new C7179e(c16527e, AbstractC12442e.adcel(seed, bArr2), (Cfinal) null, (byte[]) null).getEncoded();
        } catch (IOException e3) {
            throw new IllegalStateException(AbstractC8703e.admob(e3, new StringBuilder("unable to encode composite public key: ")));
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f32072e.hashCode();
    }
}
