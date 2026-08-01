package defpackage;

import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13285e extends AbstractC1056e {
    public C8353e license;
    public C0027e metrica;

    @Override // defpackage.AbstractC1056e
    public final InterfaceC1425e appmetrica(FileChannel fileChannel, String str, boolean z) {
        this.license.getClass();
        return C8353e.appmetrica(fileChannel, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0048. Please report as an issue. */
    @Override // defpackage.AbstractC1056e
    public final C0521e license(FileChannel fileChannel, String str) {
        this.metrica.getClass();
        C7936e c7936e = C0027e.appmetrica;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        fileChannel.size();
        c7936e.getClass();
        int i = C1724e.ad;
        C0320e c0320e = new C0320e();
        C4965e.ad(fileChannel, c0320e, str);
        while (true) {
            if (fileChannel.position() < fileChannel.size()) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                int i2 = C1724e.ad;
                C18524e c18524e = new C18524e(ByteOrder.BIG_ENDIAN);
                c18524e.appmetrica(fileChannel);
                EnumC13453e ad = EnumC13453e.ad((String) c18524e.f36317e);
                AbstractC11130e abstractC11130e = null;
                abstractC11130e = null;
                abstractC11130e = null;
                if (ad != null) {
                    switch (ad) {
                        case FORMAT_VERSION:
                            C18468e c18468e = new C18468e(AbstractC17416e.metrica(fileChannel, c18524e), c18524e, 3);
                            c18468e.f36195e = c0320e;
                            abstractC11130e = c18468e;
                            break;
                        case APPLICATION:
                            C18468e c18468e2 = new C18468e(AbstractC17416e.metrica(fileChannel, c18524e), c18524e, 0);
                            c18468e2.f36195e = c0320e;
                            abstractC11130e = c18468e2;
                            break;
                        case SOUND:
                            c0320e.ad = c18524e.f36318e;
                            c0320e.vip = fileChannel.position();
                            c0320e.metrica = fileChannel.position() + c18524e.f36318e;
                            break;
                        case COMMON:
                            C18468e c18468e3 = new C18468e(AbstractC17416e.metrica(fileChannel, c18524e), c18524e, 2);
                            c18468e3.f36195e = c0320e;
                            abstractC11130e = c18468e3;
                            break;
                        case COMMENTS:
                            C18468e c18468e4 = new C18468e(AbstractC17416e.metrica(fileChannel, c18524e), c18524e, 1);
                            c18468e4.f36195e = c0320e;
                            abstractC11130e = c18468e4;
                            break;
                        case NAME:
                            abstractC11130e = new C1988e(c18524e, AbstractC17416e.metrica(fileChannel, c18524e), c0320e, 3);
                            break;
                        case AUTHOR:
                            abstractC11130e = new C1988e(c18524e, AbstractC17416e.metrica(fileChannel, c18524e), c0320e, 1);
                            break;
                        case COPYRIGHT:
                            abstractC11130e = new C1988e(c18524e, AbstractC17416e.metrica(fileChannel, c18524e), c0320e, 2);
                            break;
                        case ANNOTATION:
                            abstractC11130e = new C1988e(c18524e, AbstractC17416e.metrica(fileChannel, c18524e), c0320e, 0);
                            break;
                    }
                }
                if (abstractC11130e != null) {
                    if (!abstractC11130e.mo741e()) {
                        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                    }
                } else {
                    if (c18524e.f36318e < 0) {
                        StringBuilder isPro = AbstractC8703e.isPro(str, " Not a valid header, unable to read a sensible size:Header");
                        isPro.append((String) c18524e.f36317e);
                        isPro.append("Size:");
                        isPro.append(c18524e.f36318e);
                        String sb = isPro.toString();
                        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                        throw new Exception(sb);
                    }
                    fileChannel.position(fileChannel.position() + c18524e.f36318e);
                }
                AbstractC3395e.ad(fileChannel, c18524e);
            }
        }
        if (c0320e.ad != -1) {
            C7936e c7936e2 = AbstractC1983e.ad;
            c0320e.license = (int) Math.round((r9 * 8) / (c0320e.mopub * 1000));
        }
        return c0320e;
    }
}
