package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;

/* renamed from: eؑۨٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0742e implements PublicKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f3040e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f3041e;

    public C0742e(Ctry ctry, PublicKey... publicKeyArr) {
        this.f3040e = new C16527e(ctry);
        if (publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided for the composite public key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (PublicKey publicKey : publicKeyArr) {
            arrayList.add(publicKey);
        }
        this.f3041e = DesugarCollections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0742e) {
            C0742e c0742e = (C0742e) obj;
            if (c0742e.f3040e.equals(this.f3040e) && this.f3041e.equals(c0742e.f3041e)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.f3040e.f32408e);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [extends, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [default, catch, eًٌَ] */
    @Override // java.security.Key
    public final byte[] getEncoded() {
        C16527e c16527e = this.f3040e;
        Ctry ctry = c16527e.f32408e;
        boolean m4675native = ctry.m4675native(InterfaceC18193e.appmetrica);
        List list = this.f3041e;
        if (m4675native) {
            try {
                byte[] encoded = ((PublicKey) list.get(0)).getEncoded();
                HashMap hashMap = AbstractC1010e.ad;
                if (encoded == null) {
                    throw new IllegalArgumentException("keyInfoData array null");
                }
                if (encoded.length == 0) {
                    throw new IllegalArgumentException("keyInfoData array empty");
                }
                isPro ispro = new isPro(0, AbstractC12442e.adcel(AbstractC0111e.ad(AbstractC1010e.ad(C3780e.loadAd(Cdefault.inmobi(encoded)))).f8385e.crashlytics(), AbstractC16825e.ad(AbstractC12903e.ad(((PublicKey) list.get(1)).getEncoded())).f8385e.crashlytics()));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ?? ccatch = new Ccatch(c16527e, ispro);
                ccatch.f20096e = -1;
                ccatch.Signature(new C7850e(1, byteArrayOutputStream), true);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("unable to encode composite public key: ")));
            }
        }
        crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
        for (int i = 0; i < list.size(); i++) {
            crashlyticsVar.appmetrica(ctry.isVip(InterfaceC14178e.tapsense) ? C3780e.loadAd(((PublicKey) list.get(i)).getEncoded()) : C3780e.loadAd(((PublicKey) list.get(i)).getEncoded()).f8385e);
        }
        try {
            ?? ccatch2 = new Ccatch(crashlyticsVar);
            ccatch2.f20096e = -1;
            isPro ispro2 = new isPro(0, ccatch2.smaato());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            ?? ccatch3 = new Ccatch(c16527e, ispro2);
            ccatch3.f20096e = -1;
            ccatch3.subscription(byteArrayOutputStream2, "DER");
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException e2) {
            throw new IllegalStateException(AbstractC8703e.admob(e2, new StringBuilder("unable to encode composite public key: ")));
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f3041e.hashCode();
    }
}
