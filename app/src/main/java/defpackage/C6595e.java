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

/* renamed from: eؙۗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6595e extends AbstractC6975e {
    static {
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC18291e.f35874e);
        hashSet.add(InterfaceC18291e.f35899e);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C4503e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C4503e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C4657e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C4657e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C4503e) || (key instanceof C4657e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؖۦٌ, java.security.PrivateKey, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        C5858e c5858e = (C5858e) AbstractC8294e.metrica(c7179e);
        obj.f9771e = c7179e.f14673e;
        obj.f9772e = c5858e;
        obj.f9770e = AbstractC1433e.billing(((C4113e) c5858e.f3209e).f9073e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗؖٚ, java.lang.Object, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        C9884e c9884e = (C9884e) AbstractC1010e.ad(c3780e);
        obj.f9986e = c9884e;
        obj.f9985e = AbstractC1433e.billing(((C4113e) c9884e.f3209e).f9073e);
        return obj;
    }
}
