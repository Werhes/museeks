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

/* renamed from: eَؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10041e extends AbstractC6975e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet();
        ad = hashSet;
        hashSet.add(InterfaceC18291e.f35812e);
        hashSet.add(InterfaceC18291e.f35871e);
        hashSet.add(InterfaceC18291e.f35784e);
        hashSet.add(InterfaceC18291e.f35851e);
        hashSet.add(InterfaceC18291e.f35826e);
        hashSet.add(InterfaceC18291e.f35843e);
    }

    public C10041e() {
        super(ad);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C9644e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C9644e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C7079e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C7079e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C9644e) || (key instanceof C7079e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.security.PrivateKey, eٍٟؕ, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        C11035e c11035e = (C11035e) AbstractC8294e.metrica(c7179e);
        obj.f19118e = c7179e.f14673e;
        obj.f19119e = c11035e;
        obj.f19117e = AbstractC1433e.billing(((C0838e) c11035e.f3209e).vip);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُؚۖ, java.lang.Object, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        C17060e c17060e = (C17060e) AbstractC1010e.ad(c3780e);
        obj.f14536e = c17060e;
        obj.f14535e = AbstractC1433e.billing(((C0838e) c17060e.f3209e).vip);
        return obj;
    }
}
