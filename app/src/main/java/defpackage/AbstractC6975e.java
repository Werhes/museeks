package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* renamed from: eؙؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6975e extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final Ctry keyOid;
    private final Set<Ctry> keyOids;

    public AbstractC6975e(Set set) {
        this.keyOid = null;
        this.keyOids = set;
    }

    public AbstractC6975e(Ctry ctry) {
        this.keyOid = ctry;
        this.keyOids = null;
    }

    public final void ad(Ctry ctry) {
        Ctry ctry2 = this.keyOid;
        if (ctry2 != null) {
            if (!ctry2.isVip(ctry)) {
                throw new InvalidKeySpecException(AbstractC4653e.inmobi("incorrect algorithm OID for key: ", ctry));
            }
        } else if (!this.keyOids.contains(ctry)) {
            throw new InvalidKeySpecException(AbstractC4653e.inmobi("incorrect algorithm OID for key: ", ctry));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C7179e loadAd = C7179e.loadAd(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            ad(loadAd.f14672e.f32408e);
            return generatePrivate(loadAd);
        } catch (IllegalStateException e) {
            throw new InvalidKeySpecException(e.getMessage());
        } catch (InvalidKeySpecException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new InvalidKeySpecException(e3.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
        try {
            C3780e loadAd = C3780e.loadAd(((X509EncodedKeySpec) keySpec).getEncoded());
            ad(loadAd.f8386e.f32408e);
            return generatePublic(loadAd);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (Exception e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }
}
