package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17106e implements InterfaceC2747e {
    public final InterfaceC14468e ad;
    public final float appmetrica;
    public final int license;
    public final InterfaceC3886e metrica;
    public final InterfaceC12123e purchase;
    public final InterfaceC6428e vip;

    public C17106e(InterfaceC14468e interfaceC14468e, InterfaceC6428e interfaceC6428e, InterfaceC3886e interfaceC3886e, int i, float f, InterfaceC12123e interfaceC12123e) {
        this.ad = interfaceC14468e;
        this.vip = interfaceC6428e;
        this.metrica = interfaceC3886e;
        this.license = i;
        this.appmetrica = f;
        this.purchase = interfaceC12123e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((InterfaceC16719e) list.get(i3)).loadAd(i);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer num;
        int mo493e = interfaceC0732e.mo493e(this.appmetrica);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).mo2529while(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).mo2529while(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
            num = valueOf;
        }
        return Math.max(mo493e, num != null ? num.intValue() : 0);
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer num;
        int mo493e = interfaceC0732e.mo493e(this.appmetrica);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).metrica(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).metrica(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
            num = valueOf;
        }
        return Math.max(mo493e, num != null ? num.intValue() : 0);
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((InterfaceC16719e) list.get(i3)).smaato(i);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, final long j) {
        int i;
        int i2;
        final C17106e c17106e = this;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i3);
            if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e), "navigationIcon")) {
                final AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, 0, 0, 0, 14, j));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list.get(i4);
                    if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e2), "actionIcons")) {
                        final AbstractC2832e admob2 = interfaceC16719e2.admob(C5602e.ad(0, 0, 0, 0, 14, j));
                        EnumC7792e layoutDirection = interfaceC13158e.getLayoutDirection();
                        InterfaceC12123e interfaceC12123e = c17106e.purchase;
                        float billing = AbstractC12220e.billing(interfaceC12123e, layoutDirection);
                        float purchase = AbstractC12220e.purchase(interfaceC12123e, interfaceC13158e.getLayoutDirection());
                        int max = Math.max(interfaceC13158e.mo493e(AbstractC10560e.purchase), admob.f6806e);
                        if (C5602e.yandex(j) == Integer.MAX_VALUE) {
                            i = C5602e.yandex(j);
                        } else {
                            int yandex = (((C5602e.yandex(j) - max) - admob2.f6806e) - interfaceC13158e.mo493e(billing)) - interfaceC13158e.mo493e(purchase);
                            i = yandex < 0 ? 0 : yandex;
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            InterfaceC16719e interfaceC16719e3 = (InterfaceC16719e) list.get(i6);
                            if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e3), "title")) {
                                final AbstractC2832e admob3 = interfaceC16719e3.admob(C5602e.ad(0, i5, 0, 0, 12, j));
                                C4782e c4782e = AbstractC14806e.vip;
                                final int mo393try = admob3.mo393try(c4782e) != Integer.MIN_VALUE ? admob3.mo393try(c4782e) : 0;
                                float invoke = c17106e.ad.invoke();
                                int appmetrica = Float.isNaN(invoke) ? 0 : AbstractC1561e.appmetrica(invoke);
                                final int max2 = Math.max(interfaceC13158e.mo493e(c17106e.appmetrica), admob3.f6804e) + interfaceC13158e.mo493e(interfaceC12123e.license()) + interfaceC13158e.mo493e(interfaceC12123e.ad());
                                if (C5602e.billing(j) == Integer.MAX_VALUE) {
                                    i2 = max2;
                                } else {
                                    int i7 = appmetrica + max2;
                                    i2 = i7 >= 0 ? i7 : 0;
                                }
                                int mo493e = interfaceC13158e.mo493e(interfaceC12123e.license());
                                int mo493e2 = interfaceC13158e.mo493e(interfaceC12123e.ad());
                                final int mo493e3 = interfaceC13158e.mo493e(AbstractC12220e.billing(interfaceC12123e, interfaceC13158e.getLayoutDirection()));
                                final int mo493e4 = interfaceC13158e.mo493e(AbstractC12220e.purchase(interfaceC12123e, interfaceC13158e.getLayoutDirection()));
                                final int i8 = (mo493e + i2) - mo493e2;
                                return interfaceC13158e.ads(C5602e.yandex(j), i2, C9139e.f18290e, new Function1() { // from class: eؚۥٗ
                                    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
                                    @Override // kotlin.jvm.functions.Function1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r14) {
                                        /*
                                            r13 = this;
                                            eؕۢٓ r14 = (defpackage.AbstractC3698e) r14
                                            eؔۚؓ r0 = defpackage.AbstractC2832e.this
                                            int r1 = r0.f6804e
                                            int r2 = r3
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            int r3 = r2
                                            defpackage.AbstractC3698e.advert(r14, r0, r3, r1)
                                            float r1 = defpackage.AbstractC10560e.purchase
                                            int r1 = defpackage.AbstractC4653e.ad(r14, r1)
                                            int r0 = r0.f6806e
                                            int r0 = java.lang.Math.max(r1, r0)
                                            eؔۚؓ r1 = r5
                                            int r4 = r1.f6806e
                                            eۣٗٚ r5 = r9
                                            eؖؖؖ r6 = r5.metrica
                                            eؔۚؓ r7 = r4
                                            int r8 = r7.f6806e
                                            long r9 = r6
                                            int r11 = defpackage.C5602e.yandex(r9)
                                            eًؚٙ r12 = defpackage.EnumC7792e.f15794e
                                            int r6 = r6.ad(r8, r11, r12)
                                            if (r6 >= r0) goto L3b
                                            int r0 = r0 - r6
                                        L38:
                                            int r0 = r0 + r3
                                            int r6 = r6 + r0
                                            goto L4f
                                        L3b:
                                            int r0 = r7.f6806e
                                            int r0 = r0 + r6
                                            int r8 = defpackage.C5602e.yandex(r9)
                                            int r8 = r8 - r4
                                            if (r0 <= r8) goto L4f
                                            int r0 = defpackage.C5602e.yandex(r9)
                                            int r0 = r0 - r4
                                            int r4 = r7.f6806e
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L38
                                        L4f:
                                            eؙٖ٘ r0 = r5.vip
                                            eٌَٕ r3 = defpackage.AbstractC16497e.appmetrica
                                            boolean r3 = defpackage.AbstractC7890e.billing(r0, r3)
                                            if (r3 == 0) goto L60
                                            int r0 = r7.f6804e
                                            int r0 = r2 - r0
                                            int r0 = r0 / 2
                                            goto L8b
                                        L60:
                                            eُٟٗ r3 = defpackage.AbstractC16497e.license
                                            boolean r0 = defpackage.AbstractC7890e.billing(r0, r3)
                                            r3 = 0
                                            if (r0 == 0) goto L8a
                                            int r0 = r5.license
                                            if (r0 != 0) goto L72
                                            int r0 = r7.f6804e
                                            int r0 = r2 - r0
                                            goto L8b
                                        L72:
                                            int r4 = r7.f6804e
                                            int r5 = r10
                                            int r5 = r4 - r5
                                            int r0 = r0 - r5
                                            int r5 = r0 + r4
                                            int r8 = r11
                                            if (r5 <= r8) goto L81
                                            int r5 = r5 - r8
                                            int r0 = r0 - r5
                                        L81:
                                            int r4 = r2 - r4
                                            int r0 = java.lang.Math.max(r3, r0)
                                            int r0 = r4 - r0
                                            goto L8b
                                        L8a:
                                            r0 = r3
                                        L8b:
                                            defpackage.AbstractC3698e.advert(r14, r7, r6, r0)
                                            int r0 = defpackage.C5602e.yandex(r9)
                                            int r3 = r1.f6806e
                                            int r0 = r0 - r3
                                            int r3 = r8
                                            int r0 = r0 - r3
                                            int r3 = r1.f6804e
                                            int r2 = r2 - r3
                                            int r2 = r2 / 2
                                            defpackage.AbstractC3698e.advert(r14, r1, r0, r2)
                                            kotlin.Unit r14 = kotlin.Unit.INSTANCE
                                            return r14
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7592e.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i6++;
                            c17106e = this;
                        }
                        AbstractC17404e.vip("Collection contains no element matching the predicate.");
                        throw new C14803e(9);
                    }
                    i4++;
                    c17106e = this;
                }
                AbstractC17404e.vip("Collection contains no element matching the predicate.");
                throw new C14803e(9);
            }
            i3++;
            c17106e = this;
        }
        AbstractC17404e.vip("Collection contains no element matching the predicate.");
        throw new C14803e(9);
    }
}
