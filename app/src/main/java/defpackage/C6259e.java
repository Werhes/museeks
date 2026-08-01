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

/* renamed from: eؙؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6259e extends AbstractC6975e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet();
        ad = hashSet;
        hashSet.add(InterfaceC18291e.f35796e);
        hashSet.add(InterfaceC18291e.f35898e);
        hashSet.add(InterfaceC18291e.f35842e);
        hashSet.add(InterfaceC18291e.f35849e);
    }

    public C6259e() {
        super(ad);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C7034e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C7034e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C4044e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C4044e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C7034e) || (key instanceof C4044e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.security.PrivateKey, java.lang.Object, eٍؚؑ] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        obj.f14396e = c7179e.f14673e;
        obj.f14397e = (C0625e) AbstractC8294e.metrica(c7179e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؖؑ, java.lang.Object, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        obj.f8994e = (C16204e) AbstractC1010e.ad(c3780e);
        return obj;
    }
}
