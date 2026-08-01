package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;

/* renamed from: eؙٜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6520e extends AbstractC6975e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet();
        ad = hashSet;
        hashSet.add(InterfaceC0760e.f3085e);
        hashSet.add(InterfaceC0760e.f3062e);
        hashSet.add(InterfaceC0760e.f3075e);
        hashSet.add(InterfaceC18291e.f35853e);
        hashSet.add(InterfaceC18291e.f35799e);
        hashSet.add(InterfaceC18291e.f35877e);
    }

    public C6520e() {
        super(ad);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C16325e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C16325e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C4969e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C4969e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C16325e) || (key instanceof C4969e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٛؐ, java.security.PrivateKey, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        obj.f32073e = c7179e.f14673e;
        C1364e c1364e = (C1364e) AbstractC8294e.metrica(c7179e);
        obj.f32075e = c1364e;
        obj.f32074e = AbstractC1433e.billing(((C12532e) c1364e.f3209e).f25095e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؗٙ, java.lang.Object, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        C0957e c0957e = (C0957e) AbstractC1010e.ad(c3780e);
        obj.f10535e = c0957e;
        obj.f10534e = AbstractC1433e.billing(((C12532e) c0957e.f3209e).f25095e);
        return obj;
    }
}
