package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4711e extends C1781e {
    public static final HashSet billing = new HashSet(Arrays.asList("AUTHOR", "COPYRIGHT", "DESCRIPTION", "RATING", "TITLE"));

    @Override // defpackage.C1781e, defpackage.C1548e
    public final String ad(String str) {
        StringBuilder sb = new StringBuilder(super.ad(str));
        sb.append(str);
        sb.append("  |->Title      : ");
        sb.append(billing("TITLE"));
        String str2 = AbstractC12394e.ad;
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Author     : ");
        sb.append(billing("AUTHOR"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Copyright  : ");
        sb.append(billing("COPYRIGHT"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Description: ");
        sb.append(billing("DESCRIPTION"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Rating     :");
        sb.append(billing("RATING"));
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.C1781e
    public final long adcel(ByteArrayOutputStream byteArrayOutputStream) {
        long license = license();
        byteArrayOutputStream.write(this.vip.ad());
        AbstractC12394e.startapp(license(), byteArrayOutputStream);
        AbstractC12394e.billing((billing("TITLE").length() * 2) + 2, byteArrayOutputStream);
        AbstractC12394e.billing((billing("AUTHOR").length() * 2) + 2, byteArrayOutputStream);
        AbstractC12394e.billing((billing("COPYRIGHT").length() * 2) + 2, byteArrayOutputStream);
        AbstractC12394e.billing((billing("DESCRIPTION").length() * 2) + 2, byteArrayOutputStream);
        AbstractC12394e.billing((billing("RATING").length() * 2) + 2, byteArrayOutputStream);
        String billing2 = billing("TITLE");
        Charset charset = C2637e.billing;
        byteArrayOutputStream.write(AbstractC12394e.vip(billing2, charset));
        byte[] bArr = C2637e.yandex;
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC12394e.vip(billing("AUTHOR"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC12394e.vip(billing("COPYRIGHT"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC12394e.vip(billing("DESCRIPTION"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC12394e.vip(billing("RATING"), charset));
        byteArrayOutputStream.write(bArr);
        return license;
    }

    @Override // defpackage.C1781e
    public final long license() {
        return (billing("AUTHOR").length() * 2) + 44 + (billing("DESCRIPTION").length() * 2) + (billing("RATING").length() * 2) + (billing("TITLE").length() * 2) + (billing("COPYRIGHT").length() * 2);
    }

    @Override // defpackage.C1781e
    public final boolean yandex(C8905e c8905e) {
        return billing.contains(c8905e.f17871e) && super.yandex(c8905e);
    }
}
