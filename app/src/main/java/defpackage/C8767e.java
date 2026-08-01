package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8767e extends AbstractC7691e {
    public C11141e license;

    @Override // defpackage.AbstractC7691e
    public final void billing(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str) {
        this.license.getClass();
        C7936e c7936e = C11141e.ad;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        try {
            C12671e license = C11141e.license(fileChannel, str);
            fileChannel.position(0L);
            try {
                long size = fileChannel.size();
                ByteBuffer ad = C11141e.ad((C12671e) interfaceC1425e, license);
                if (!license.f25400e || license.f25402e.f21996e == null) {
                    fileChannel.position(fileChannel.size());
                    if (AbstractC1983e.yandex(fileChannel.size())) {
                        fileChannel.write(ByteBuffer.allocateDirect(1));
                    }
                    C11141e.yandex(fileChannel, ad);
                } else {
                    if (license.f25401e) {
                        Iterator it = license.f25403e.iterator();
                        boolean z = false;
                        while (true) {
                            if (it.hasNext()) {
                                C15116e c15116e = (C15116e) it.next();
                                if (z) {
                                    String str2 = c15116e.ad;
                                    EnumC13453e enumC13453e = EnumC13453e.TAG;
                                    if (!str2.equals("ID3 ")) {
                                        break;
                                    }
                                } else if (c15116e.vip == license.purchase()) {
                                    z = true;
                                }
                            } else if (z) {
                                C11141e.vip(fileChannel, license, str);
                                fileChannel.position(fileChannel.size());
                                if (AbstractC1983e.yandex(fileChannel.size())) {
                                    fileChannel.write(ByteBuffer.allocateDirect(1));
                                }
                                C11141e.yandex(fileChannel, ad);
                            }
                        }
                        throw new Exception(str + " Metadata tags are corrupted and not at end of fc so cannot be fixed");
                    }
                    C18524e billing = C11141e.billing(fileChannel, license, str);
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    if (license.f25400e) {
                        license.f25402e.f21997e.getClass();
                        license.f25402e.f21996e.getClass();
                    }
                    ad.limit();
                    c7936e.getClass();
                    if (C11141e.appmetrica(license, fileChannel)) {
                        C11141e.yandex(fileChannel, ad);
                    } else {
                        C11141e.metrica(fileChannel, license, billing, str);
                        fileChannel.position(fileChannel.size());
                        if (AbstractC1983e.yandex(fileChannel.size())) {
                            fileChannel.write(ByteBuffer.allocateDirect(1));
                        }
                        C11141e.yandex(fileChannel, ad);
                    }
                }
                if (size != fileChannel.size()) {
                    C11141e.purchase(fileChannel);
                }
            } catch (IOException e) {
                throw new Exception(AbstractC8703e.admob(e, AbstractC8703e.isPro(str, ":")));
            }
        } catch (IOException e2) {
            throw new Exception(AbstractC8703e.admob(e2, AbstractC8703e.isPro(str, ":")));
        }
    }

    @Override // defpackage.AbstractC7691e
    public final void purchase(FileChannel fileChannel, String str) {
        this.license.getClass();
        try {
            C7936e c7936e = C11141e.ad;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            C12671e license = C11141e.license(fileChannel, str);
            fileChannel.position(0L);
            if (license.f25400e && license.f25402e.f21996e != null) {
                C18524e billing = C11141e.billing(fileChannel, license, str);
                if (C11141e.appmetrica(license, fileChannel)) {
                    license.purchase();
                    c7936e.getClass();
                    fileChannel.truncate(license.purchase());
                } else {
                    c7936e.getClass();
                    C11141e.metrica(fileChannel, license, billing, str);
                }
                C11141e.purchase(fileChannel);
            }
            c7936e.getClass();
        } catch (IOException e) {
            throw new Exception(AbstractC8703e.admob(e, AbstractC8703e.isPro(str, ":")));
        }
    }
}
