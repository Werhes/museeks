package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0083e {
    public static final C6488e ad = new Object();

    public static List Signature(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return ((InterfaceC5021e) interfaceC10269e).getParameters();
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    /* renamed from: abstract, reason: not valid java name */
    public static int m230abstract(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return ((InterfaceC5021e) interfaceC10269e).getParameters().size();
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static boolean ad(InterfaceC10269e interfaceC10269e, InterfaceC10269e interfaceC10269e2) {
        if (!(interfaceC10269e instanceof InterfaceC5021e)) {
            StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
        }
        if (interfaceC10269e2 instanceof InterfaceC5021e) {
            return interfaceC10269e.equals(interfaceC10269e2);
        }
        StringBuilder signatures2 = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e2, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e2.getClass(), signatures2).toString());
    }

    public static int adcel(InterfaceC12198e interfaceC12198e) {
        if (interfaceC12198e instanceof C17970e) {
            return ((C17970e) interfaceC12198e).f35222e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC12198e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC12198e.getClass(), sb).toString());
    }

    public static AbstractC1186e admob(InterfaceC4752e interfaceC4752e) {
        if (interfaceC4752e instanceof InterfaceC16046e) {
            return AbstractC16279e.yandex((InterfaceC16046e) interfaceC4752e);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC4752e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4752e.getClass(), sb).toString());
    }

    public static boolean ads(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return ((InterfaceC5021e) interfaceC10269e).admob();
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static InterfaceC0023e advert(InterfaceC9905e interfaceC9905e, int i) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return (InterfaceC0023e) ((AbstractC1186e) interfaceC9905e).mopub().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    public static final ArrayList amazon(InterfaceC7227e interfaceC7227e) {
        Collection premium = interfaceC7227e.premium();
        ArrayList arrayList = new ArrayList();
        for (Object obj : premium) {
            if (obj instanceof InterfaceC5261e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean applovin(InterfaceC10269e interfaceC10269e) {
        if (!(interfaceC10269e instanceof InterfaceC5021e)) {
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ")).toString());
        }
        InterfaceC4077e advert = ((InterfaceC5021e) interfaceC10269e).advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        return (interfaceC5052e == null || interfaceC5052e.mo1718extends() != 1 || interfaceC5052e.mo1724e() == 3 || interfaceC5052e.mo1724e() == 4 || interfaceC5052e.mo1724e() == 5) ? false : true;
    }

    public static C12519e appmetrica(InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            if (interfaceC14822e instanceof C12519e) {
                return (C12519e) interfaceC14822e;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    public static AbstractC10226e billing(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            AbstractC15728e subscription = ((AbstractC1186e) interfaceC9905e).subscription();
            if (subscription instanceof AbstractC10226e) {
                return (AbstractC10226e) subscription;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* renamed from: break, reason: not valid java name */
    public static AbstractC15728e m231break(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC15728e) {
            return AbstractC16481e.purchase((AbstractC15728e) interfaceC9905e, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* renamed from: case, reason: not valid java name */
    public static final C11997e m232case(InterfaceC9215e interfaceC9215e, String str, C3434e c3434e, Function1 function1) {
        AbstractC2803e c18110e;
        C10365e c10365e = new C10365e(c3434e);
        C9847e c9847e = C9847e.vip;
        List list = AbstractC12447e.billing(str).ad;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1252e c1252e = (C1252e) list.get(i);
            String str2 = c1252e.ad;
            int m2467class = AbstractC8703e.m2467class(c1252e.vip);
            if (m2467class == 0) {
                c18110e = str2.equals("*") ? C18358e.vip : new C18110e(str2);
            } else {
                if (m2467class != 1) {
                    throw new C14803e(10);
                }
                int m1865interface = AbstractC5304e.m1865interface(str2, '{', 0, 6);
                int m1883while = AbstractC5304e.m1883while(str2, '}', 0, 6);
                String substring = m1865interface == 0 ? null : str2.substring(0, m1865interface);
                String substring2 = m1883while != str2.length() - 1 ? str2.substring(m1883while + 1) : null;
                String substring3 = str2.substring(m1865interface + 1, m1883while);
                if (AbstractC6507e.amazon(substring3, "?", false)) {
                    c18110e = new C6810e(AbstractC5304e.ads(1, substring3), substring, substring2);
                } else if (!AbstractC6507e.amazon(substring3, "...", false)) {
                    c18110e = new C3176e(substring3, substring, substring2);
                } else {
                    if (substring2 != null && substring2.length() != 0) {
                        throw new IllegalArgumentException("Suffix after tailcard is not supported");
                    }
                    String ads = AbstractC5304e.ads(3, substring3);
                    if (substring == null) {
                        substring = BuildConfig.FLAVOR;
                    }
                    c18110e = new C17695e(ads, substring);
                }
            }
            interfaceC9215e = ((C11997e) interfaceC9215e).admob(c18110e);
        }
        if (AbstractC6507e.amazon(str, "/", false)) {
            interfaceC9215e = ((C11997e) interfaceC9215e).admob(C5804e.vip);
        }
        C11997e admob = ((C11997e) interfaceC9215e).admob(c10365e);
        function1.invoke(admob);
        return admob;
    }

    /* renamed from: catch, reason: not valid java name */
    public static AbstractC1186e m233catch(InterfaceC8476e interfaceC8476e, InterfaceC9905e interfaceC9905e) {
        if (!(interfaceC9905e instanceof AbstractC15728e)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC9905e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
        }
        if (interfaceC8476e instanceof C4542e) {
            return ((C4542e) interfaceC8476e).billing(1, (AbstractC1186e) interfaceC9905e);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC8476e);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC8476e.getClass(), sb2).toString());
    }

    /* renamed from: class, reason: not valid java name */
    public static boolean m234class(InterfaceC9905e interfaceC9905e) {
        return (interfaceC9905e instanceof AbstractC10226e) && ((AbstractC10226e) interfaceC9905e).Signature();
    }

    public static boolean crashlytics(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return interfaceC10269e instanceof C0024e;
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    /* renamed from: default, reason: not valid java name */
    public static Collection m235default(InterfaceC4045e interfaceC4045e, InterfaceC14822e interfaceC14822e) {
        InterfaceC10269e mo1272native = interfaceC4045e.mo1272native(interfaceC14822e);
        if (mo1272native instanceof C0024e) {
            return ((C0024e) mo1272native).f1161e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m236extends(InterfaceC0023e interfaceC0023e) {
        if (interfaceC0023e instanceof AbstractC16232e) {
            return ((AbstractC16232e) interfaceC0023e).metrica();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0023e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC0023e.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: final, reason: not valid java name */
    public static C16838e m237final(InterfaceC4045e interfaceC4045e, InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            AbstractC1186e abstractC1186e = (AbstractC1186e) interfaceC14822e;
            return new C16838e(interfaceC4045e, new C4542e(AbstractC16257e.vip.tapsense(abstractC1186e.loadAd(), abstractC1186e.mopub())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    public static boolean firebase(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return interfaceC10269e instanceof C14376e;
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    /* renamed from: goto, reason: not valid java name */
    public static boolean m238goto(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return AbstractC11957e.appmetrica((AbstractC1186e) interfaceC9905e);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* renamed from: implements, reason: not valid java name */
    public static AbstractC16232e m239implements(InterfaceC9192e interfaceC9192e) {
        if (interfaceC9192e instanceof C17236e) {
            return ((C17236e) interfaceC9192e).f33768e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9192e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9192e.getClass(), sb).toString());
    }

    /* renamed from: import, reason: not valid java name */
    public static final void m240import(ZipOutputStream zipOutputStream, File file, int i) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m240import(zipOutputStream, file, i);
                } else {
                    byte[] bArr = new byte[2048];
                    String path = file2.getPath();
                    String substring = path.substring(i);
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(path), 2048);
                    try {
                        ZipEntry zipEntry = new ZipEntry(substring);
                        zipEntry.setTime(file2.lastModified());
                        zipOutputStream.putNextEntry(zipEntry);
                        for (int read = bufferedInputStream2.read(bArr, 0, 2048); read != -1; read = bufferedInputStream2.read(bArr, 0, 2048)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                }
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean inmobi(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return AbstractC13270e.m3537goto((InterfaceC5021e) interfaceC10269e, AbstractC0206e.ad);
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    /* renamed from: interface, reason: not valid java name */
    public static boolean m241interface(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return AbstractC13270e.m3537goto((InterfaceC5021e) interfaceC10269e, AbstractC0206e.vip);
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static boolean isPro(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return ((InterfaceC5021e) interfaceC10269e).advert() instanceof InterfaceC5052e;
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static boolean isVip(InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2) {
        if (!(interfaceC14822e instanceof AbstractC10226e)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC14822e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
        }
        if (interfaceC14822e2 instanceof AbstractC10226e) {
            return ((AbstractC10226e) interfaceC14822e).mopub() == ((AbstractC10226e) interfaceC14822e2).mopub();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC14822e2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e2.getClass(), sb2).toString());
    }

    public static InterfaceC12198e license(InterfaceC4045e interfaceC4045e, InterfaceC7557e interfaceC7557e) {
        if (interfaceC7557e instanceof AbstractC10226e) {
            if (interfaceC7557e instanceof C15050e) {
                return interfaceC4045e.mo1275private(((C15050e) interfaceC7557e).f29819e);
            }
            if (interfaceC7557e instanceof C17970e) {
                return (C17970e) interfaceC7557e;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7557e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC7557e.getClass(), sb).toString());
    }

    public static InterfaceC4752e loadAd(InterfaceC10269e interfaceC10269e, int i) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return (InterfaceC4752e) ((InterfaceC5021e) interfaceC10269e).getParameters().get(i);
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static InterfaceC13961e metrica(InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            return (InterfaceC13961e) interfaceC14822e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    public static AbstractC15728e mopub(InterfaceC4045e interfaceC4045e, InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2) {
        if (!(interfaceC14822e instanceof AbstractC10226e)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC4045e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4045e.getClass(), sb).toString());
        }
        if (interfaceC14822e2 instanceof AbstractC10226e) {
            return AbstractC1596e.ad((AbstractC10226e) interfaceC14822e, (AbstractC10226e) interfaceC14822e2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC4045e);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4045e.getClass(), sb2).toString());
    }

    /* renamed from: native, reason: not valid java name */
    public static boolean m242native(InterfaceC12198e interfaceC12198e) {
        if (interfaceC12198e instanceof C17970e) {
            return ((C17970e) interfaceC12198e).f35224e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC12198e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC12198e.getClass(), sb).toString());
    }

    /* renamed from: new, reason: not valid java name */
    public static C17236e m243new(InterfaceC12198e interfaceC12198e) {
        if (interfaceC12198e instanceof C17970e) {
            return ((C17970e) interfaceC12198e).f35221e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC12198e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC12198e.getClass(), sb).toString());
    }

    /* renamed from: package, reason: not valid java name */
    public static InterfaceC9905e m244package(InterfaceC4045e interfaceC4045e, InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof InterfaceC14822e) {
            return interfaceC4045e.loadAd((InterfaceC14822e) interfaceC9905e);
        }
        if (!(interfaceC9905e instanceof InterfaceC13215e)) {
            throw new IllegalStateException("sealed");
        }
        InterfaceC13215e interfaceC13215e = (InterfaceC13215e) interfaceC9905e;
        return interfaceC4045e.mo1249e(interfaceC4045e.loadAd((InterfaceC14822e) interfaceC4045e.admob(interfaceC13215e)), interfaceC4045e.loadAd((InterfaceC14822e) interfaceC4045e.Signature(interfaceC13215e)));
    }

    public static boolean premium(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return AbstractC4520e.purchase((AbstractC1186e) interfaceC9905e);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* renamed from: private, reason: not valid java name */
    public static AbstractC10226e m245private(InterfaceC13215e interfaceC13215e) {
        if (interfaceC13215e instanceof AbstractC14773e) {
            return ((AbstractC14773e) interfaceC13215e).f29221e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13215e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC13215e.getClass(), sb).toString());
    }

    public static int pro(InterfaceC0023e interfaceC0023e) {
        if (interfaceC0023e instanceof AbstractC16232e) {
            return AbstractC12176e.metrica(((AbstractC16232e) interfaceC0023e).ad());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0023e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC0023e.getClass(), sb).toString());
    }

    /* renamed from: protected, reason: not valid java name */
    public static AbstractC15728e m246protected(InterfaceC12198e interfaceC12198e) {
        if (interfaceC12198e instanceof C17970e) {
            return ((C17970e) interfaceC12198e).f35223e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC12198e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC12198e.getClass(), sb).toString());
    }

    public static AbstractC14773e purchase(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            AbstractC15728e subscription = ((AbstractC1186e) interfaceC9905e).subscription();
            if (subscription instanceof AbstractC14773e) {
                return (AbstractC14773e) subscription;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    public static InterfaceC16046e remoteconfig(InterfaceC10269e interfaceC10269e) {
        if (!(interfaceC10269e instanceof InterfaceC5021e)) {
            StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
        }
        InterfaceC4077e advert = ((InterfaceC5021e) interfaceC10269e).advert();
        if (advert instanceof InterfaceC16046e) {
            return (InterfaceC16046e) advert;
        }
        return null;
    }

    public static int signatures(InterfaceC4752e interfaceC4752e) {
        if (interfaceC4752e instanceof InterfaceC16046e) {
            return AbstractC12176e.metrica(((InterfaceC16046e) interfaceC4752e).mo2738e());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC4752e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4752e.getClass(), sb).toString());
    }

    public static List smaato(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return ((AbstractC1186e) interfaceC9905e).mopub();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.AbstractC10226e startapp(defpackage.InterfaceC14822e r17) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0083e.startapp(eٔٛۚ):eَْ");
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static InterfaceC5021e m247strictfp(InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            return ((AbstractC10226e) interfaceC14822e).loadAd();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    public static boolean subs(InterfaceC10269e interfaceC10269e) {
        if (!(interfaceC10269e instanceof InterfaceC5021e)) {
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ")).toString());
        }
        InterfaceC4077e advert = ((InterfaceC5021e) interfaceC10269e).advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        return (interfaceC5052e != null ? interfaceC5052e.mo1728e() : null) instanceof C10773e;
    }

    public static AbstractC15728e subscription(InterfaceC4045e interfaceC4045e, InterfaceC0023e interfaceC0023e) {
        if (interfaceC4045e.adcel(interfaceC0023e)) {
            return null;
        }
        if (interfaceC0023e instanceof AbstractC16232e) {
            return ((AbstractC16232e) interfaceC0023e).vip().subscription();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0023e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC0023e.getClass(), sb).toString());
    }

    /* renamed from: super, reason: not valid java name */
    public static Collection m248super(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC5021e) {
            return ((InterfaceC5021e) interfaceC10269e).ad();
        }
        StringBuilder signatures = AbstractC17861e.signatures("ClassicTypeSystemContext couldn't handle: ", interfaceC10269e, ", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC10269e.getClass(), signatures).toString());
    }

    public static boolean tapsense(InterfaceC4752e interfaceC4752e, InterfaceC10269e interfaceC10269e) {
        if (!(interfaceC4752e instanceof InterfaceC16046e)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC4752e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4752e.getClass(), sb).toString());
        }
        InterfaceC16046e interfaceC16046e = (InterfaceC16046e) interfaceC4752e;
        if (interfaceC10269e == null ? true : interfaceC10269e instanceof InterfaceC5021e) {
            return AbstractC16279e.startapp(interfaceC16046e, (InterfaceC5021e) interfaceC10269e, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC16046e);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC16046e.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: this, reason: not valid java name */
    public static boolean m249this(InterfaceC7557e interfaceC7557e) {
        if (interfaceC7557e instanceof AbstractC1186e) {
            return AbstractC13270e.m3536class((AbstractC1186e) interfaceC7557e);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC7557e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC7557e.getClass(), sb).toString());
    }

    /* renamed from: throw, reason: not valid java name */
    public static void m250throw(InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    /* renamed from: transient, reason: not valid java name */
    public static AbstractC10226e m251transient(InterfaceC14822e interfaceC14822e, boolean z) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            return ((AbstractC10226e) interfaceC14822e).pro(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    /* renamed from: try, reason: not valid java name */
    public static AbstractC10226e m252try(InterfaceC13215e interfaceC13215e) {
        if (interfaceC13215e instanceof AbstractC14773e) {
            return ((AbstractC14773e) interfaceC13215e).f29222e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13215e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC13215e.getClass(), sb).toString());
    }

    public static int vip(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return ((AbstractC1186e) interfaceC9905e).mopub().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }

    /* renamed from: while, reason: not valid java name */
    public static void m253while(InterfaceC14822e interfaceC14822e) {
        if (interfaceC14822e instanceof AbstractC10226e) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC14822e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC14822e.getClass(), sb).toString());
    }

    public static C7878e yandex(InterfaceC9905e interfaceC9905e) {
        if (interfaceC9905e instanceof AbstractC1186e) {
            return new C7878e(1, (AbstractC1186e) interfaceC9905e);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC9905e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
    }
}
