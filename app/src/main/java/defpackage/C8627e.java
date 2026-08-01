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

/* renamed from: eٌُۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8627e extends AbstractC6975e {
    public static final HashSet ad;

    static {
        HashSet hashSet = new HashSet();
        ad = hashSet;
        hashSet.add(InterfaceC18291e.f35805e);
        hashSet.add(InterfaceC18291e.f35828e);
        hashSet.add(InterfaceC18291e.f35869e);
        hashSet.add(InterfaceC18291e.f35910e);
        hashSet.add(InterfaceC18291e.f35886e);
        hashSet.add(InterfaceC18291e.f35778e);
        hashSet.add(InterfaceC18291e.f35777e);
        hashSet.add(InterfaceC18291e.f35776e);
        hashSet.add(InterfaceC18291e.f35867e);
        hashSet.add(InterfaceC18291e.f35911e);
        hashSet.add(InterfaceC18291e.f35909e);
        hashSet.add(InterfaceC18291e.f35794e);
        hashSet.add(InterfaceC18291e.f35895e);
        hashSet.add(InterfaceC18291e.f35772e);
        hashSet.add(InterfaceC18291e.f35913e);
        hashSet.add(InterfaceC18291e.f35892e);
        hashSet.add(InterfaceC18291e.f35893e);
        hashSet.add(InterfaceC18291e.f35771e);
        hashSet.add(InterfaceC18291e.f35787e);
        hashSet.add(InterfaceC18291e.f35879e);
        hashSet.add(InterfaceC18291e.f35847e);
        hashSet.add(InterfaceC18291e.f35823e);
        hashSet.add(InterfaceC18291e.f35856e);
        hashSet.add(InterfaceC18291e.f35832e);
        hashSet.add(InterfaceC18291e.f35839e);
        hashSet.add(InterfaceC18291e.f35833e);
        hashSet.add(InterfaceC18291e.f35785e);
        hashSet.add(InterfaceC18291e.f35788e);
        hashSet.add(InterfaceC18291e.f35804e);
        hashSet.add(InterfaceC18291e.f35862e);
        hashSet.add(InterfaceC18291e.f35902e);
        hashSet.add(InterfaceC18291e.f35840e);
        hashSet.add(InterfaceC18291e.f35821e);
        hashSet.add(InterfaceC18291e.f35885e);
        hashSet.add(InterfaceC18291e.f35779e);
        hashSet.add(InterfaceC18291e.f35790e);
        hashSet.add(InterfaceC18291e.f35890e);
        hashSet.add(InterfaceC18291e.f35814e);
        hashSet.add(InterfaceC18291e.f35792e);
        hashSet.add(InterfaceC18291e.f35852e);
        hashSet.add(InterfaceC18291e.f35770e);
        hashSet.add(InterfaceC18291e.f35901e);
        hashSet.add(InterfaceC18291e.f35894e);
        hashSet.add(InterfaceC18291e.f35831e);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C5883e) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C5883e) key).getEncoded());
            }
        } else {
            if (!(key instanceof C2823e)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C2823e) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C5883e) || (key instanceof C2823e)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘۚؗ, java.security.PrivateKey, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        ?? obj = new Object();
        obj.f12430e = c7179e.f14673e;
        obj.f12431e = (C1463e) AbstractC8294e.metrica(c7179e);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.security.PublicKey, eؔۙۘ] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        ?? obj = new Object();
        obj.f6785e = (C14077e) AbstractC1010e.ad(c3780e);
        return obj;
    }
}
