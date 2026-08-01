package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2637e extends AbstractC8578e {
    public static final Charset billing = Charset.forName("UTF-16LE");
    public static final byte[] yandex = {0, 0};
    public final long purchase;

    static {
        new HashSet().add(C7056e.smaato);
    }

    public C2637e(long j, BigInteger bigInteger, long j2) {
        super(C7056e.yandex, j, bigInteger);
        this.purchase = j2;
    }

    @Override // defpackage.AbstractC8578e, defpackage.C1548e
    public final String ad(String str) {
        StringBuilder isPro = AbstractC8703e.isPro(str, "  | : Contains: \"");
        isPro.append(this.purchase);
        isPro.append("\" chunks");
        isPro.append(AbstractC12394e.ad);
        return new StringBuilder(metrica(str, isPro.toString())).toString();
    }
}
