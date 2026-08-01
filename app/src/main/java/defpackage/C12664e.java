package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12664e implements InterfaceC9204e {
    public static final C12664e appmetrica;
    public static final Set license;
    public static final String metrica;
    public static final C12664e purchase;
    public final String ad;
    public final String vip;

    static {
        String metrica2 = AbstractC12684e.metrica("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        metrica = metrica2;
        String metrica3 = AbstractC12684e.metrica("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String metrica4 = AbstractC12684e.metrica("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        license = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new C12007e("proto"), new C12007e("json"))));
        appmetrica = new C12664e(metrica2, null);
        purchase = new C12664e(metrica3, metrica4);
    }

    public C12664e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public static C12664e ad(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C12664e(str2, str3);
    }
}
