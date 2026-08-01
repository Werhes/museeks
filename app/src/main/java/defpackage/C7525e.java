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

/* renamed from: eؚۡۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7525e extends AbstractC6975e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet();
        ad = hashSet;
        hashSet.add(InterfaceC18291e.f35836e);
        hashSet.add(InterfaceC18291e.f35857e);
        hashSet.add(InterfaceC18291e.f35798e);
    }

    public C7525e() {
        super(ad);
    }

    @Override // defpackage.AbstractC6975e, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // defpackage.AbstractC6975e, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C10069e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C10069e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C3956e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C3956e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C10069e) || (key instanceof C3956e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؗؓ, java.security.PrivateKey, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        obj.f19900e = c7179e.f14673e;
        obj.f19901e = (C13865e) AbstractC8294e.metrica(c7179e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؘؚؖ, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        obj.f8822e = (C18338e) AbstractC1010e.ad(c3780e);
        return obj;
    }
}
