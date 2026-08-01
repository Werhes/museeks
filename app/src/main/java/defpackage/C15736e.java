package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15736e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30987e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f30988e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f30989e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30990e;

    public /* synthetic */ C15736e(int i, Object obj, Object obj2, int i2) {
        this.f30990e = i2;
        this.f30988e = i;
        this.f30987e = obj;
        this.f30989e = obj2;
    }

    public /* synthetic */ C15736e(InterfaceC18435e interfaceC18435e, AbstractC16904e abstractC16904e, int i) {
        this.f30990e = 3;
        this.f30987e = interfaceC18435e;
        this.f30989e = abstractC16904e;
        this.f30988e = i;
    }

    public /* synthetic */ C15736e(Object obj, int i, Object obj2, int i2) {
        this.f30990e = i2;
        this.f30987e = obj;
        this.f30988e = i;
        this.f30989e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        char c;
        C1296e c1296e;
        boolean z = true;
        switch (this.f30990e) {
            case 0:
                InterfaceC12424e interfaceC12424e = (InterfaceC12424e) this.f30987e;
                int i = this.f30988e;
                C13410e c13410e = (C13410e) this.f30989e;
                InterfaceC12424e interfaceC12424e2 = interfaceC12424e;
                char c2 = 2;
                int i2 = i == 2 ? 2 : 1;
                InterfaceC6744e isPro = interfaceC12424e2.isPro();
                if (i2 != 2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TreeMap treeMap = new TreeMap(new C14912e(false));
                    C18525e c18525e = C18525e.appmetrica;
                    Iterator it = new ArrayList(C18525e.smaato).iterator();
                    while (it.hasNext()) {
                        C18525e c18525e2 = (C18525e) it.next();
                        AbstractC4265e.yandex("Currently only support ConstantQuality", c18525e2 instanceof C18525e);
                        InterfaceC16104e vip = isPro.vip(c18525e2.ad(i2));
                        if (vip != null) {
                            boolean z2 = z;
                            AbstractC9464e.yandex("CapabilitiesByQuality", "profiles = " + vip);
                            if (vip.license().isEmpty()) {
                                c = c2;
                                c1296e = null;
                            } else {
                                int ad = vip.ad();
                                int vip2 = vip.vip();
                                List metrica = vip.metrica();
                                List license = vip.license();
                                c = c2;
                                AbstractC4265e.license(!license.isEmpty(), "Should contain at least one VideoProfile.");
                                c1296e = new C1296e(ad, vip2, DesugarCollections.unmodifiableList(new ArrayList(metrica)), DesugarCollections.unmodifiableList(new ArrayList(license)), !metrica.isEmpty() ? (C0194e) metrica.get(0) : null, (C1900e) license.get(0));
                            }
                            if (c1296e == null) {
                                AbstractC9464e.remoteconfig("CapabilitiesByQuality", "EncoderProfiles of quality " + c18525e2 + " has no video validated profiles.");
                            } else {
                                treeMap.put(c1296e.purchase.ad(), c18525e2);
                                linkedHashMap.put(c18525e2, c1296e);
                            }
                            z = z2;
                            c2 = c;
                        }
                    }
                    boolean z3 = z;
                    char c3 = c2;
                    if (linkedHashMap.isEmpty()) {
                        AbstractC9464e.adcel("CapabilitiesByQuality", "No supported EncoderProfiles");
                    } else {
                        ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
                    }
                    if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                        AbstractC9464e.remoteconfig("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                        C18525e[] c18525eArr = new C18525e[3];
                        c18525eArr[0] = C18525e.billing;
                        c18525eArr[z3 ? 1 : 0] = C18525e.purchase;
                        c18525eArr[c3] = C18525e.appmetrica;
                        isPro = new C0360e(interfaceC12424e2, AbstractC6874e.startapp(c18525eArr), c13410e);
                    }
                    C3909e c3909e = AbstractC12904e.ad;
                    C8397e c8397e = new C8397e(new C10922e(isPro, c3909e, interfaceC12424e2, c13410e), c3909e);
                    Set vip3 = interfaceC12424e2.vip();
                    if (!(vip3 instanceof Collection) || !vip3.isEmpty()) {
                        Iterator it2 = vip3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C14677e c14677e = (C14677e) it2.next();
                                if (c14677e.ad == 3 && c14677e.vip == 10) {
                                    c8397e = new C8397e(c8397e, c13410e);
                                }
                            }
                        }
                    }
                    isPro = new C12513e(c8397e, interfaceC12424e2, c3909e);
                } else if (!interfaceC12424e2.smaato()) {
                    isPro = InterfaceC6744e.ad;
                }
                return new C14013e(isPro, i2, interfaceC12424e2.vip());
            case 1:
                int i3 = this.f30988e;
                String str = (String) this.f30987e;
                C2511e c2511e = (C2511e) this.f30989e;
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    interfaceC9998eArr[i4] = AbstractC10003e.appmetrica(str + '.' + c2511e.appmetrica[i4], C6805e.purchase, new InterfaceC9998e[0]);
                }
                return interfaceC9998eArr;
            case 2:
                int i5 = this.f30988e;
                AudioTrack audioTrack = (AudioTrack) this.f30987e;
                C13642e c13642e = (C13642e) this.f30989e;
                int i6 = audioTrack.appmetrica;
                String str2 = audioTrack.ad;
                if (i5 >= i6) {
                    c13642e.m3633import(0L, str2);
                } else {
                    c13642e.m3633import(i5, str2);
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC5336e.purchase((InterfaceC18435e) this.f30987e, null, 0, new C16813e((AbstractC16904e) this.f30989e, this.f30988e, null, 1), 3);
                return Unit.INSTANCE;
            default:
                C12344e c12344e = (C12344e) this.f30987e;
                int i7 = this.f30988e;
                Function0 function0 = (Function0) this.f30989e;
                if (c12344e == null || c12344e.f24750e) {
                    return null;
                }
                return new C6571e(EnumC13401e.f26652e, new C16202e(c12344e, i7, function0, 7));
        }
    }
}
