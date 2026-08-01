package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* renamed from: eؚۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7563e extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public final /* synthetic */ int ad;

    public /* synthetic */ C7563e(int i) {
        this.ad = i;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        switch (this.ad) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        throw new InvalidKeySpecException(e2.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        throw new InvalidKeySpecException(e4.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        throw new InvalidKeySpecException(e5.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        throw new InvalidKeySpecException(e6.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        throw new InvalidKeySpecException(e7.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        throw new InvalidKeySpecException(e8.toString());
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        throw new InvalidKeySpecException(e9.toString());
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return generatePrivate(C7179e.loadAd(Cdefault.inmobi(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        throw new InvalidKeySpecException(e10.toString());
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        switch (this.ad) {
            case 0:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 1:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e2) {
                        throw new InvalidKeySpecException(e2.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 2:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
            case 3:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e4) {
                        throw new InvalidKeySpecException(e4.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 4:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e5) {
                        throw new InvalidKeySpecException(e5.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 5:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e6) {
                        throw new InvalidKeySpecException(e6.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 6:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e7) {
                        throw new InvalidKeySpecException(e7.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 7:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e8) {
                        throw new InvalidKeySpecException(e8.toString());
                    }
                }
                throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
            case 8:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e9) {
                        throw new InvalidKeySpecException(e9.toString());
                    }
                }
                throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
            default:
                if (keySpec instanceof X509EncodedKeySpec) {
                    try {
                        return generatePublic(C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded()));
                    } catch (Exception e10) {
                        throw new InvalidKeySpecException(e10.toString());
                    }
                }
                throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        switch (this.ad) {
            case 0:
                if (key instanceof C8947e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C8947e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C14389e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C14389e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof C4743e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C4743e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C9480e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C9480e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof C11889e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C11889e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C14637e)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C14637e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "unknown key specification: ", "."));
            case 3:
                if (key instanceof C15082e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C15082e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C0238e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C0238e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 4:
                if (key instanceof C12750e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C12750e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C12384e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C12384e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof C16923e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C16923e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C3282e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C3282e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof C9372e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C9372e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C15622e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C15622e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof C6278e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C6278e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C9752e)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C9752e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof C0802e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C0802e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C9017e)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C9017e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof C9096e) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C9096e) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C17962e)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C17962e) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(AbstractC17861e.loadAd(cls, "unknown key specification: ", "."));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        switch (this.ad) {
            case 0:
                if ((key instanceof C8947e) || (key instanceof C14389e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 1:
                if ((key instanceof C4743e) || (key instanceof C9480e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 2:
                if ((key instanceof C11889e) || (key instanceof C14637e)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
            case 3:
                if ((key instanceof C15082e) || (key instanceof C0238e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 4:
                if ((key instanceof C12750e) || (key instanceof C12384e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 5:
                if ((key instanceof C16923e) || (key instanceof C3282e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 6:
                if ((key instanceof C9372e) || (key instanceof C15622e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 7:
                if ((key instanceof C6278e) || (key instanceof C9752e)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 8:
                if ((key instanceof C0802e) || (key instanceof C9017e)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
            default:
                if ((key instanceof C9096e) || (key instanceof C17962e)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.security.PrivateKey, java.lang.Object, eٌۙۜ] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.security.PrivateKey, java.lang.Object, eٌۤٚ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eًؗۚ, java.security.PrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.security.PrivateKey, java.lang.Object, eِٞۛ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.security.PrivateKey, java.lang.Object, eٔۥٓ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.security.PrivateKey, eّۛ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.security.PrivateKey, java.lang.Object, eَٗۧ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.security.PrivateKey, java.lang.Object, eٍَٓ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [eٌٌؙ, java.security.PrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [eؒؓۛ, java.security.PrivateKey, java.lang.Object] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey generatePrivate(C7179e c7179e) {
        switch (this.ad) {
            case 0:
                ?? obj = new Object();
                obj.f17963e = c7179e.f14673e;
                obj.f17964e = (C14074e) AbstractC8294e.metrica(c7179e);
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.f10157e = c7179e.f14673e;
                obj2.f10158e = (C7432e) AbstractC8294e.metrica(c7179e);
                return obj2;
            case 2:
                ?? obj3 = new Object();
                obj3.f23819e = c7179e.f14673e;
                obj3.f23820e = (AbstractC13156e) AbstractC8294e.metrica(c7179e);
                return obj3;
            case 3:
                ?? obj4 = new Object();
                obj4.f29863e = c7179e.f14673e;
                obj4.f29864e = (C0901e) AbstractC8294e.metrica(c7179e);
                return obj4;
            case 4:
                ?? obj5 = new Object();
                obj5.f25508e = c7179e.f14673e;
                obj5.f25509e = (C5351e) AbstractC8294e.metrica(c7179e);
                return obj5;
            case 5:
                ?? obj6 = new Object();
                obj6.f33149e = c7179e.f14673e;
                obj6.f33150e = (C10052e) AbstractC8294e.metrica(c7179e);
                return obj6;
            case 6:
                ?? obj7 = new Object();
                obj7.f18633e = c7179e.f14673e;
                obj7.f18634e = (C9974e) AbstractC8294e.metrica(c7179e);
                return obj7;
            case 7:
                ?? obj8 = new Object();
                obj8.f13087e = c7179e.f14673e;
                obj8.f13089e = C11717e.loadAd(c7179e.f14672e.f32407e).f23551e.f32408e;
                obj8.f13088e = (C2185e) AbstractC8294e.metrica(c7179e);
                return obj8;
            case 8:
                ?? obj9 = new Object();
                obj9.f3191e = c7179e.f14673e;
                obj9.f3192e = C10285e.loadAd(c7179e.f14672e.f32407e).f20301e.f32408e;
                obj9.f3193e = (C2047e) AbstractC8294e.metrica(c7179e);
                return obj9;
            default:
                ?? obj10 = new Object();
                obj10.f18216e = c7179e.f14673e;
                obj10.f18218e = C17299e.loadAd(c7179e.f14672e.f32407e).f33943e.f32408e;
                obj10.f18217e = (C7770e) AbstractC8294e.metrica(c7179e);
                return obj10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٓۦۤ, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, eّ٘ۘ, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eٍَٕ, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.security.PublicKey, eَؙٔ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eُؚؑ, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eٍّۡ, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.security.PublicKey, eَؕۧ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٕٞؓ, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v8, types: [eٍْۛ, java.lang.Object, java.security.PublicKey] */
    /* JADX WARN: Type inference failed for: r0v9, types: [eٌ۟۟, java.lang.Object, java.security.PublicKey] */
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey generatePublic(C3780e c3780e) {
        switch (this.ad) {
            case 0:
                ?? obj = new Object();
                obj.f28461e = (C14593e) AbstractC1010e.ad(c3780e);
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.f18819e = (C18542e) AbstractC1010e.ad(c3780e);
                return obj2;
            case 2:
                ?? obj3 = new Object();
                obj3.f28871e = (AbstractC13156e) AbstractC1010e.ad(c3780e);
                return obj3;
            case 3:
                ?? obj4 = new Object();
                obj4.f1487e = (C12034e) AbstractC1010e.ad(c3780e);
                return obj4;
            case 4:
                ?? obj5 = new Object();
                obj5.f24809e = (C10020e) AbstractC1010e.ad(c3780e);
                return obj5;
            case 5:
                ?? obj6 = new Object();
                obj6.f7437e = (C6255e) AbstractC1010e.ad(c3780e);
                return obj6;
            case 6:
                ?? obj7 = new Object();
                obj7.f30810e = (C3960e) AbstractC1010e.ad(c3780e);
                return obj7;
            case 7:
                ?? obj8 = new Object();
                obj8.f19277e = C11717e.loadAd(c3780e.f8386e.f32407e).f23551e.f32408e;
                obj8.f19276e = (C7319e) AbstractC1010e.ad(c3780e);
                return obj8;
            case 8:
                ?? obj9 = new Object();
                C17464e c17464e = (C17464e) AbstractC1010e.ad(c3780e);
                obj9.f18081e = c17464e;
                obj9.f18080e = AbstractC12992e.metrica(c17464e.f29816e);
                return obj9;
            default:
                ?? obj10 = new Object();
                C5529e c5529e = (C5529e) AbstractC1010e.ad(c3780e);
                obj10.f35207e = c5529e;
                obj10.f35208e = AbstractC12992e.metrica(c5529e.f29816e);
                return obj10;
        }
    }
}
